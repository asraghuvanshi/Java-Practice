package javapractice;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ArrayList {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		LinkedList linkedlist = new LinkedList();
		List l = Collections.synchronizedList(linkedlist);
		System.out.println(l);
		System.out.println(list instanceof Serializable);
		System.out.println(list instanceof Cloneable);
		System.out.println(linkedlist instanceof RandomAccess);
	}

}