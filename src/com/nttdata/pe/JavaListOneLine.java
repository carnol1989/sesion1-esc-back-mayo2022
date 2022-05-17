package com.nttdata.pe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaListOneLine {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("foo", "bar");
		System.out.println(list.contains("foo"));

		List<String> arrayList = new ArrayList<>(list);
		arrayList.add("baz");
		System.out.println(arrayList.size());

		String[] array = { "foo", "bar" };
		list = Arrays.asList(array);
		array[0] = "baz";
		System.out.println(list.get(0).equals("baz"));
				
		list = Stream.of("foo", "bar").collect(Collectors.toList());
		System.out.println(list.contains("foo"));

		List<String> cities = new ArrayList() {
			{
				add("New York");
				add("Rio");
				add("Tokyo");
			}
		};
		System.out.println(cities.contains("New York"));
	}

}
