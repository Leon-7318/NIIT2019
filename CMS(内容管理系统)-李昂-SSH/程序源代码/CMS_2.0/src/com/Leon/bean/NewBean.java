package com.Leon.bean;
// Generated 2018-12-23 15:15:27 by Hibernate Tools 4.3.1


import com.Leon.pojo.*;
import com.Leon.service.Impl.NewServiceImpl;
import com.Leon.service.NewService;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component()
public class NewBean  implements java.io.Serializable {

    private New top;         //置顶
    private New temp_New = new New();    //用于编辑，添加
    private List<New> all = new ArrayList<>();   //所有记录
    private List<New> show = new ArrayList<>();  //所有可显示记录
    private List<New> now = new ArrayList<>();   //当前页
    private List<New> res;   //搜索结果
    
    //0:用户; 1:管理员
    private int k=0; 
    
    private int index=1;              //当前页面下标
    private int sum;                //记录总数
    private int num;                //每页显示个数
    private int page_num;           //页数
    
    private String searchKey;   //输入框的查询内容
    
    //用于区分 0:编辑 和 1:添加
    private int f = 1;
    
    private final NewService service = new NewServiceImpl(); 
    
//    @Inject
//    FileUploadBean fileUpBean;
    
    //当前的最大ID
    private Integer ID;
            
    public NewBean(){
       //初始化属性值
        index = 1;
        sum = service.findSum();
        refreshPage();
    }
    
    //更新受管Bean，刷新页面
    public String showRefreh(){
        refreshPage();
        return "/web_front/news/newss?faces-redirect=true";
    }
    
    //显示当前新闻的详情页
    public String showNews(New n){
        temp_New = n;
        return "/web_front/news/news?faces-redirect=true";
    }
    
    public void previous(){
        if(index<=1) index = 1;
        else index--;
        refreshPage();
    }
    
    public void next(){
        if(index>=page_num) index = page_num;
        else index++;
        refreshPage();
    }
    
    public void jumpTo(int i){
        if(i<1 || i>page_num) return ;
        index = i;
        refreshPage();
    }
    
    public void refreshPage(){
        System.out.println("------------------------index: "+index+"----------------------");
        if(!all.isEmpty())all.clear();
        if(!show.isEmpty())show.clear();
        if(!now.isEmpty())now.clear();

        all = service.findAll();
        for(New n:all){
            if(n.getState()!=0) show.add(n);
            if(n.getState()==2) top = n;
        }
        if(k==0){
            now.clear(); num = 4;
            for(int i=(index-1)*num; i<index*num && i<show.size(); i++)
                now.add(show.get(i));
        }else{
            now.clear(); num = 6;
            now = service.findByRange((index-1)*num, num);
        }
        page_num = sum / num;
        if(sum%num!=0) page_num++;
    }
    
    public New getNew(int id){
    	return service.findById(id);
    }
    
    public String searchByKey(){
        System.out.println("-------------查询 ："+searchKey+"--------------");
        res = service.findByKey(searchKey);
        System.out.println("res size:"+res.size());
        
        if(res.size()>0)
            return "result";
        return null;
    }
    
    public String searchByDate(Date start, Date end){
        res = service.findByDate(start, end);
        return null;
    }
    
    public String add_New(){
        f = 1;//添加文章
        temp_New = new New();
        ID = service.getMaxId();
        temp_New.setId(ID+1);
        return "newsEdit";
    }
    
    public String edit_New(int id){
        f = 0;//修改文章
        temp_New = service.findById(id);
        return "newsEdit";
    }
    
    public String submit(MultipartFile file) throws IllegalStateException, IOException{
        boolean t = false;
		String path = "D:/project/CMS_2.0/WebContent/resource/img/";

		if (!file.isEmpty()) {
			String fileName = "n_" + temp_New.getId() + "." + file.getOriginalFilename().split("\\.")[1];
			temp_New.setImage("/img/"+fileName);
			// 新建文件
			File file1 = new File(path, fileName);
			// 将文件写入
			file.transferTo(file1);
		}

		if (f == 0) { 
			t = service.update(temp_New);
		} else { // 添加
			t = service.add(temp_New);
		}
        refreshPage();
        if(t)System.out.println("newBean----提交成功");
        if(t) return "newsList";
        System.out.println("newBean----提交失败");
        return null;
    }
    
    public void delete(New n){
        boolean f = service.delete(n);
        if(f){
            System.out.println("-------------------删除成功");
            all.remove(n);
            show.remove(n);
            now.remove(n);
        }
        else System.out.println("-------------------删除失败");
        refreshPage();
    }
    
    public void update(New n){
        boolean t = service.update(n);
        if(t) System.out.println("----状态修改成功");
        refreshPage();
    }
    
    public New getNow(int i){
        if(now.isEmpty()) return top;
        return now.get(i%now.size());
    }
     //获取指定下标的查询结果
    public New getRes(int i){
        if(res.isEmpty()) return top;
        return res.get(i%res.size());
    }
    
    public New getTop() {
        return top;
    }

    public void setTop(New top) {
        this.top = top;
    }

    public List<New> getAll() {
        return all;
    }

    public void setAll(List<New> all) {
        this.all = all;
    }

    public List<New> getShow() {
        return show;
    }

    public void setShow(List<New> show) {
        this.show = show;
    }

    public List<New> getNow() {
        return now;
    }

    public void setNow(List<New> now) {
        this.now = now;
    }

    public List<New> getRes() {
        return res;
    }

    public void setRes(List<New> res) {
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

    public New getTemp_New() {
        return temp_New;
    }

    public void setTemp_New(New temp_New) {
        this.temp_New = temp_New;
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
    
//    public static String getRequestParameter(String name) {
//        return (String)FacesContext.getCurrentInstance()
//                               .getExternalContext()
//                               .getRequestParameterMap().get(name);
//    }
    
}


