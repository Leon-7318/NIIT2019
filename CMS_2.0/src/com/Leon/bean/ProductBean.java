package com.Leon.bean;
// Generated 2018-12-23 15:15:27 by Hibernate Tools 4.3.1

import com.Leon.pojo.*;
import com.Leon.service.Impl.ProductServiceImpl;
import com.Leon.service.ProductService;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component()
public class ProductBean implements java.io.Serializable {

	private List<Product> top = new ArrayList<>(); // 置顶
	private List<Product> top_phone = new ArrayList<>(); // 置顶
	private List<Product> top_computer = new ArrayList<>(); // 置顶
	private List<Product> top_other = new ArrayList<>(); // 置顶
	private Product temp_product; // 用于编辑，添加

	private List<Product> all; // 所有记录
	private List<Product> show = new ArrayList<>(); // 所有可显示记录
	private List<Product> now = new ArrayList<>(); // 当前页
	private List<Product> res; // 搜索结果

	private List<Product> phone_list = new ArrayList<>();
	private List<Product> computer_list = new ArrayList<>();
	private List<Product> other_list = new ArrayList<>();

	private String type = "phone";

	// 0:用户; 1:管理员
	private int k = 0;
	// 用于区分 0:编辑 和 1:添加
	private int f = 1;

	private int index = 1; // 当前页面下标
	private int sum; // 记录总数
	private int num; // 每页显示个数
	private int page_num; // 页数

	private String searchKey; // 输入框的查询内容

	private final ProductService service = new ProductServiceImpl();

	// @Inject
	// FileUploadBean fileUpBean;

	public ProductBean() {
		// 初始化属性值
		index = 1;
		sum = service.findSum();
		refreshPage();
	}

	// 显示指定类型的商品页面
	public String showProducts(String type) {
		this.type = type;
		refreshPage();
		top.clear();
		if (type.equals("phone"))
			top.addAll(top_phone);
		if (type.equals("computer"))
			top.addAll(top_computer);
		if (type.equals("other"))
			top.addAll(top_other);
		return "/web_front/product/products?faces-redirect=true";

	}

	// 显示当前产品的详情页
	public String showProduct(Product p) {
		temp_product = p;
		return "/web_front/product/product?faces-redirect=true";
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
		show.clear();
		now.clear();
		phone_list.clear();
		computer_list.clear();
		other_list.clear();
		top_phone.clear();
		top_computer.clear();
		top_other.clear();

		all = service.findAll();
		for (Product p : all) {
			if (p.getState() != 0)
				show.add(p);
		}
		if (k == 0) { // 用户页面
			num = 6;
			for (Product p : show) {
				switch (p.getType()) {
				case "phone":
					phone_list.add(p);
					if (p.getState() == 2) {
						top_phone.add(p);
					}
					break;
				case "computer":
					computer_list.add(p);
					if (p.getState() == 2) {
						top_computer.add(p);
					}
					break;
				case "other":
					other_list.add(p);
					if (p.getState() == 2) {
						top_other.add(p);
					}
					break;
				}
			}
		} else if (k == 1) { // 管理员页面
			num = 6;
			for (Product p : all) {
				switch (p.getType()) {
				case "phone":
					phone_list.add(p);
					if (p.getState() == 2) {
						top_phone.add(p);
					}
					break;
				case "computer":
					computer_list.add(p);
					if (p.getState() == 2) {
						top_computer.add(p);
					}
					break;
				case "other":
					other_list.add(p);
					if (p.getState() == 2) {
						top_other.add(p);
					}
					break;
				}
			}
		}
		switch (type) {
		case "phone":
			sum = phone_list.size();
			page_num = sum / num;
			if (sum % num != 0)
				page_num++;
			for (int i = (index - 1) * num; i < index * num && i < sum; i++)
				now.add(phone_list.get(i));
			break;
		case "computer":
			sum = computer_list.size();
			page_num = sum / num;
			if (sum % num != 0)
				page_num++;
			for (int i = (index - 1) * num; i < index * num && i < sum; i++)
				now.add(computer_list.get(i));
			break;
		case "other":
			sum = other_list.size();
			page_num = sum / num;
			if (sum % num != 0)
				page_num++;
			for (int i = (index - 1) * num; i < index * num && i < sum; i++)
				now.add(other_list.get(i));
			break;
		}
	}

	public Product getProduct(int id) {
		return service.findById(id);
	}

	public String searchByKey() {
		res = service.findByKey(searchKey);
		return "result";
	}

	public String searchByDate(Date start, Date end) {
		res = service.findByDate(start, end);
		return null;
	}

	public String add_product() {
		f = 1;// 添加文章
		temp_product = new Product();
		return "productEdit";
	}

	public String edit_product(int id) {
		f = 0;
		temp_product = service.findById(id);
		return "productEdit";
	}

	// 提交修改或添加
	public String submit(MultipartFile file) throws IllegalStateException, IOException {
		boolean t = false;
		String path = "D:/project/CMS_2.0/WebContent/resource/img/";

		if (!file.isEmpty()) {
			String fileName = "n_" + temp_product.getId() + "." + file.getOriginalFilename().split("\\.")[1];
			temp_product.setImage("/img/"+fileName);
			// 新建文件
			File file1 = new File(path, fileName);
			// 将文件写入
			file.transferTo(file1);
		}

		if (f == 0) {
			t = service.update(temp_product);
		} else { // 添加
			t = service.add(temp_product);
		}
		refreshPage();
		if (t)
			System.out.println("newBean----提交成功");
		if (t)
			return "productList";
		System.out.println("newBean----提交失败");
		return null;
	}

	public void delete(Product p) {
		service.delete(p);
		refreshPage();
	}

	public void update(Product p) {
		boolean t = service.update(p);
		if (t)
			System.out.println("----状态修改成功");
		refreshPage();
	}

	public Product getNow(int i) {
		if (now.isEmpty())
			return all.get(0);
		return now.get(i % now.size());
	}

	public Product getTop(int i) {
		return top.get(i % top.size());
	}

	// 获取指定下标的查询结果
	public Product getRes(int i) {
		if (res.isEmpty())
			return top.get(0);
		return res.get(i % res.size());
	}

	public List<Product> getTop() {
		return top;
	}

	public void setTop(List<Product> top) {
		this.top = top;
	}

	public Product getTop_phone(int i) {
		return top_phone.get(i);
	}

	public List<Product> getTop_phone() {
		return top_phone;
	}

	public void setTop_phone(List<Product> top_phone) {
		this.top_phone = top_phone;
	}

	public Product getTop_computer(int i) {
		return top_computer.get(i);
	}

	public List<Product> getTop_computer() {
		return top_computer;
	}

	public void setTop_computer(List<Product> top_computer) {
		this.top_computer = top_computer;
	}

	public Product getTop_other(int i) {
		return top_other.get(i);
	}

	public List<Product> getTop_other() {
		return top_other;
	}

	public void setTop_other(List<Product> top_other) {
		this.top_other = top_other;
	}

	public List<Product> getAll() {
		return all;
	}

	public void setAll(List<Product> all) {
		this.all = all;
	}

	public List<Product> getShow() {
		return show;
	}

	public void setShow(List<Product> show) {
		this.show = show;
	}

	public List<Product> getNow() {
		return now;
	}

	public void setNow(List<Product> now) {
		this.now = now;
	}

	public List<Product> getRes() {
		return res;
	}

	public void setRes(List<Product> res) {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		refreshPage();
		System.out.println("product 类型改变！ :" + type);
	}

	public List<Product> getPhone_list() {
		return phone_list;
	}

	public void setPhone_list(List<Product> phone_list) {
		this.phone_list = phone_list;
	}

	public List<Product> getComputer_list() {
		return computer_list;
	}

	public void setComputer_list(List<Product> computer_list) {
		this.computer_list = computer_list;
	}

	public List<Product> getOther_list() {
		return other_list;
	}

	public void setOther_list(List<Product> other_list) {
		this.other_list = other_list;
	}

	public Product getTemp_product() {
		return temp_product;
	}

	public void setTemp_product(Product temp_product) {
		this.temp_product = temp_product;
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
