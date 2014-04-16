package com.dreammore.hellogit;

public class Page {
	
	public static void main(String[] args) {
		int totalPage = 7;
		
		int currentPageNo =10;
		
		int pad = 6;
		
		if (currentPageNo > totalPage) {
			currentPageNo = totalPage;
		}
		if (currentPageNo <= 0) {
			currentPageNo = 1;
		}
		
		System.out.println("上一页: " + (currentPageNo - 1));

		if (currentPageNo - pad > 2) {
			System.out.println("第1页");
			System.out.println("...");
			for(int i = pad; i >= 1; i--){
				System.out.println("第" + (currentPageNo - i) + "页");
			}
		}else {
			for(int i = 1; i < currentPageNo; i++){
				System.out.println("第" + (i) + "页");
			}
		}
		System.out.println("当前页: " + currentPageNo);
		if (currentPageNo + pad < totalPage - 1) {
			for (int i = 0; i < pad; i++) {
				System.out.println("第" + (currentPageNo + i + 1) + "页");
			}
			System.out.println("...");
			System.out.println("第" + (totalPage) + "页");
		}else {
			for(int i = currentPageNo ; i < totalPage ; i++){
				System.out.println("第" + (i + 1) + "页");
			}
		}
		System.out.println("下一页: " + (currentPageNo + 1));
		
	}
	

}
