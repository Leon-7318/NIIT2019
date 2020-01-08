package com.Leon.bean;

import com.Leon.pojo.*;
import com.Leon.service.Impl.VideoServiceImpl;
import com.Leon.service.Impl.VideoServiceImpl;
import com.Leon.service.VideoService;
import com.Leon.service.VideoService;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component()
public class VideoBean implements java.io.Serializable {

	private Video top; // 置顶
	private Video temp_Video = new Video(); // 用于编辑，添加
	private List<Video> all = new ArrayList<>(); // 所有记录
	private List<Video> show = new ArrayList<>(); // 所有可显示记录
	private List<Video> now = new ArrayList<>(); // 当前页
	private List<Video> res; // 搜索结果

	// 0:用户; 1:管理员
	private int k = 0;

	private int index = 1; // 当前页面下标
	private int sum; // 记录总数
	private int num; // 每页显示个数
	private int page_num; // 页数

	private String searchKey; // 输入框的查询内容

	// 用于区分 0:编辑 和 1:添加
	private int f = 1;

	private final VideoService service = new VideoServiceImpl();

	// @Inject
	// FileUploadBean fileUpBean;
	//
	// @Inject
	// VideoUploadBean videoUpBean;

	// 当前的最大ID
	private Integer ID;

	public VideoBean() {
		// 初始化属性值
		index = 1;
		sum = service.findSum();
		refreshPage();
	}

	// 更新受管Bean，刷新页面
	public String showRefreh() {
		refreshPage();
		return "/web_front/video/videos?faces-redirect=true";
	}

	// 显示当前视频的详情页
	public String showVideo(Video v) {
		temp_Video = v;
		return "/web_front/video/video?faces-redirect=true";
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
		for (Video n : all) {
			if (n.getState() != 0)
				show.add(n);
			if (n.getState() == 2)
				top = n;
		}
		if (k == 0) {
			now.clear();
			num = 6;
			for (int i = (index - 1) * num; i < index * num && i < show.size(); i++)
				now.add(show.get(i));
		} else {
			now.clear();
			num = 7;
			now = service.findByRange((index - 1) * num, num);
		}
		page_num = sum / num;
		if (sum % num != 0)
			page_num++;
	}

	public Video getVideo(int id) {
		return service.findById(id);
	}

	public String searchByKey() {
		System.out.println("-------------查询 ：" + searchKey + "--------------");
		res = service.findByKey(searchKey);

		System.out.println("res size:" + res.size());

		if (res.size() > 0)
			return "result";
		return null;
	}

	public String searchByDate(Date start, Date end) {
		res = service.findByDate(start, end);
		return null;
	}

	public String add_Video() {
		f = 1;// 添加
		temp_Video = new Video();
		ID = service.getMaxId();
		temp_Video.setId(ID + 1);
		return "videoEdit";
	}

	public String edit_Video(int id) {
		f = 0;// 修改
		temp_Video = service.findById(id);
		return "videoEdit";
	}

	public String submit(MultipartFile file1, MultipartFile file2) throws IllegalStateException, IOException {
		boolean t = false;

		String path1 = "D:/project/CMS_2.0/WebContent/resource/img/";
		String path2 = "D:/project/CMS_2.0/WebContent/resource/video/";

		// 图片
		if (!file1.isEmpty()) {
			String fileName = "v_" + temp_Video.getId() + "." + file1.getOriginalFilename().split("\\.")[1];
			temp_Video.setImage("/img/"+fileName);
			// 新建文件
			File file = new File(path1, fileName);
			// 将文件写入
			file1.transferTo(file);
		}
		// 视频
		if (!file2.isEmpty()) {
			String fileName = "v_" + temp_Video.getId() + "." + file2.getOriginalFilename().split("\\.")[1];
			temp_Video.setUrl("/video/"+fileName);
			// 新建文件
			File file = new File(path2, fileName);
			// 将文件写入
			file2.transferTo(file);
		}

		if (f == 0) {
			t = service.update(temp_Video);
		} else { // 添加
			t = service.add(temp_Video);
		}
		refreshPage();

		if (t)
			System.out.println("videoBean----提交成功");
		if (t)
			return "videoList";
		System.out.println("videoBean----提交失败");
		return null;
	}

	public void delete(Video n) {
		boolean f = service.delete(n);
		if (f) {
			System.out.println("-------------------删除成功");
			all.remove(n);
			show.remove(n);
			now.remove(n);
		} else
			System.out.println("-------------------删除失败");
		refreshPage();
	}

	public void update(Video n) {
		boolean t = service.update(n);
		if (t)
			System.out.println("----状态修改成功");
		refreshPage();
	}

	public Video getNow(int i) {
		if (now.isEmpty())
			return top;
		return now.get(i % now.size());
	}

	// 获取指定下标的查询结果
	public Video getRes(int i) {
		if (res.isEmpty())
			return top;
		return res.get(i % res.size());
	}

	public Video getTop(int i) {
		return now.get(i);
	}

	public Video getTop() {
		return top;
	}

	public void setTop(Video top) {
		this.top = top;
	}

	public List<Video> getAll() {
		return all;
	}

	public void setAll(List<Video> all) {
		this.all = all;
	}

	public List<Video> getShow() {
		return show;
	}

	public void setShow(List<Video> show) {
		this.show = show;
	}

	public List<Video> getNow() {
		return now;
	}

	public void setNow(List<Video> now) {
		this.now = now;
	}

	public List<Video> getRes() {
		return res;
	}

	public void setRes(List<Video> res) {
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

	public Video getTemp_Video() {
		return temp_Video;
	}

	public void setTemp_Video(Video temp_Video) {
		this.temp_Video = temp_Video;
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

	// public static String getRequestParameter(String name) {
	// return (String)FacesContext.getCurrentInstance()
	// .getExternalContext()
	// .getRequestParameterMap().get(name);
	// }

}
