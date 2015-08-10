package com.haochen.structure;

import java.util.List;

/**
 * 单向链表
 * 
 * @title
 * @Description
 * @author chenhao
 * @date 2014年12月31日 下午2:41:52
 * @version 1.0
 */
public class LinkedList {
	private TNode head;// 链表的头结点
	private TNode tail;// 链表的尾结点
	private int size;
	private int DEFAULT_CAPACITY = 10;

	public LinkedList() {
	}

	public LinkedList add(Object data) {
		TNode newNode = new TNode(data);
		if (head == null) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		tail = newNode;
		size++;
		return this;
	}

	public int size() {
		return size;
	}

	class TNode {
		TNode next;
		Object data;

		TNode(Object data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		List list = new java.util.LinkedList();
	}

}
