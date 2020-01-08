package com.Leon.bean;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.Leon.pojo.Conference;
import com.Leon.service.ConferenceService;
import com.Leon.service.Impl.ConferenceServiceImpl;

@Component()
public class ConferenceBean implements java.io.Serializable {

	private Conference top; // 置顶
	private Conference temp_Conference = new Conference(); // 用于编辑，添加
	private List<Conference> all = new ArrayList<>(); // 所有记录
	private List<Conference> show = new ArrayList<>(); // 所有可显示记录
	private List<Conference> now = new ArrayList<>(); // 当前页
	private List<Conference> res; // 搜索结果

	// 0:用户; 1:管理员
	private int k = 0;
	// 用于区分 0:编辑 和 1:添加
	private int f = 1;

	private int index = 1; // 当前页面下标
	private int sum; // 记录总数
	private int num; // 每页显示个数
	private int page_num; // 页数

	private String searchKey; // 输入框的查询内容

	private final ConferenceService service = new ConferenceServiceImpl();

	// @Inject
	// FileUploadBean fileUpBean;

	// 当前的最大ID
	private Integer ID;

	public ConferenceBean() {
		// 初始化属性值
		index = 1;
		sum = service.findSum();
		refreshPage();
	}

	// 更新受管Bean，刷新页面
	public String showRefreh() {
		refreshPage();
		return "/web_front/conference/conferences?faces-redirect=true";
	}

	// 显示当前发布会的详情页
	public String showConference(Conference c) {
		temp_Conference = c;
		return "/web_front/conference/conference?faces-redirect=true";
	}

	public void previous() {
		if (index <= 1)
			index = 1;
		else
			index--;
		refreshPage();
	}

	public void next() {
		if (index >= page_num)
			index = page_num;
		else
			index++;
		refreshPage();
	}

	public void jumpTo(int i) {
		if (i < 1 || i > page_num)
			return;
		index = i;
		refreshPage();
	}

	public void refreshPage() {
		System.out.println("------------------------index: " + index + "----------------------");
		if (!all.isEmpty())
			all.clear();
		if (!show.isEmpty())
			show.clear();
		if (!now.isEmpty())
			now.clear();

		all = service.findAll();
		for (Conference n : all) {
			if (n.getState() != 0)
				show.add(n);
			if (n.getState() == 2)
				top = n;
		}
		if (k == 0) {
			now.clear();
			num = 4;
			for (int i = (index - 1) * num; i < index * num && i < show.size(); i++)
				now.add(show.get(i));
		} else {
			now.clear();
			num = 6;
			now = service.findByRange((index - 1) * num, num);
		}
		page_num = sum / num;
		if (sum % num != 0)
			page_num++;
	}

	public Conference getConference(int id) {
		return service.findById(id);
	}

	public String searchByKey() {
		res = service.findByKey(searchKey);
		System.out.println("-------------查询 ：" + searchKey + "--------------");
		System.out.println("res size:" + res.size());
		if (res.size() > 0)
			return "result";
		return null;
	}

	public String searchByDate(Date start, Date end) {
		res = service.findByDate(start, end);
		return null;
	}

	public String add_Conference() {
		f = 1;// 添加文章
		temp_Conference = new Conference();
		ID = service.getMaxId();
		temp_Conference.setId(ID + 1);
		return "confEdit";
	}

	public String edit_Conference(int id) {
		f = 0;// 修改文章
		temp_Conference = service.findById(id);

		System.out.println(temp_Conference.toString());

		return "confEdit";
	}

	public String submit(MultipartFile file) throws IllegalStateException, IOException {
		boolean t = false;
		String path = "D:/project/CMS_2.0/WebContent/resource/img/";

		if (!file.isEmpty()) {
			String fileName = "c_" + temp_Conference.getId() + "." + file.getOriginalFilename().split("\\.")[1];
			temp_Conference.setPoster("/img/"+fileName);
			// 新建文件
			File file1 = new File(path, fileName);
			// 将文件写入
			file.transferTo(file1);
		}

		if (f == 0) {
			t = service.update(temp_Conference);
		} else { // 添加新的发布会
			t = service.add(temp_Conference);
		}

		refreshPage();
		if (t)
			System.out.println("confBean----提交成功");
		if (t)
			return "confList";
		System.out.println("confBean----提交失败");
		return null;
	}

	public void delete(Conference n) {
		boolean bool = service.delete(n);
		if (bool) {
			System.out.println("-------------------删除成功");
			all.remove(n);
			show.remove(n);
			now.remove(n);
		} else
			System.out.println("-------------------删除失败");
		refreshPage();
	}

	public void update(Conference n) {
		boolean t = service.update(n);
		if (t)
			System.out.println("----状态修改成功");
		refreshPage();
	}

	public Conference getNow(int i) {
		if (now.isEmpty())
			return top;
		return now.get(i % now.size());
	}

	// 获取指定下标的查询结果
	public Conference getRes(int i) {
		if (res.isEmpty())
			return top;
		return res.get(i % res.size());
	}

	public Conference getTop() {
		return top;
	}

	public void setTop(Conference top) {
		this.top = top;
	}

	public List<Conference> getAll() {
		return all;
	}

	public void setAll(List<Conference> all) {
		this.all = all;
	}

	public List<Conference> getShow() {
		return show;
	}

	public void setShow(List<Conference> show) {
		this.show = show;
	}

	public List<Conference> getNow() {
		return now;
	}

	public void setNow(List<Conference> now) {
		this.now = now;
	}

	public List<Conference> getRes() {
		return res;
	}

	public void setRes(List<Conference> res) {
		this.res = res;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPage_num() {
		return page_num;
	}

	public void setPage_num(int page_num) {
		this.page_num = page_num;
	}

	public Conference getTemp_Conference() {
		return temp_Conference;
	}

	public void setTemp_Conference(Conference temp_Conference) {
		this.temp_Conference = temp_Conference;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

}
