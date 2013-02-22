package com.dou.book.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dou.book.data.ISBookMapper;
import com.dou.book.data.pojo.SBook;
import com.dou.book.data.services.ISBookServices;



@SuppressWarnings("unchecked")
public class SBookAction {
	@Autowired
	ISBookServices bookServices;
	private SBook sbook;
	private String tips;
	private String bookId;
	private List bookList;

	/**
	 * 添加图书信息
	 * 
	 * @return 返回添加是否成功
	 */
	public String addSBook() {
		String result = "error";
		try {
			bookServices.saveBook(sbook);
			this.setTips("添加成功");
			result = "success";
		} catch (Exception e) {
			e.printStackTrace();
			this.setTips("系统出现问题");
		}
		return result;
	}

	/**
	 * 查看所有图书
	 * 
	 * @return
	 */
	public String viewSBook() {
		String result = "error";
		try {
			bookList = bookServices.findAllBook();
			result = "success";
		} catch (Exception e) {
			e.printStackTrace();
			this.setTips("系统出现问题，请稍后访问");
		}
		return result;
	}

	/**
	 * 修改图书信息
	 * 
	 * @return
	 */
	/*public String modifySBook() {
		String result = "error";
		try {
			sbook = sbookServices.getBookById(Integer
					.parseInt(this.getBookId()));
			result = "success";
		} catch (Exception e) {
			e.printStackTrace();
			this.setTips("系统出现问题");
		}
		return result;
	}
*/
	/*public String updateSBook() {
		String result = "error";
		try {
			sbookServices.updateBook(sbook);
			result = "success";
		} catch (Exception e) {
			e.printStackTrace();
			this.setTips("更新操作失败");
		}
		return result;
	}*/

	/**
	 * 删除图书
	 * 
	 * @return
	 */
/*	public String removeSBook() {
		String result = "error";
		try {
			sbookServices.removeBook(Integer.parseInt(this.getBookId()));
			result = "success";
		} catch (Exception e) {
			e.printStackTrace();
			this.setTips("删除操作失败");
		}
		return result;
	}*/

	public SBook getSbook() {
		return sbook;
	}

	public void setSbook(SBook sbook) {
		this.sbook = sbook;
	}

	public List getBookList() {
		return bookList;
	}

	public void setBookList(List bookList) {
		this.bookList = bookList;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
}
