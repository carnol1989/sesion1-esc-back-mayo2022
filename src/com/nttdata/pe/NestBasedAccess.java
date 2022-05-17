package com.nttdata.pe;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class NestBasedAccess {

	public static void main(String[] args) {
		boolean isNestMate = NestBasedAccess.class.isNestmateOf(NestBasedAccess.Inner.class);
		boolean nestHost = NestBasedAccess.Inner.class.getNestHost() == NestBasedAccess.class;

		System.out.println(isNestMate);
		System.out.println(nestHost);

		Set<String> nestedMembers = Arrays.stream(NestBasedAccess.Inner.class.getNestMembers())
				.map(Class::getName)
				.collect(Collectors.toSet());
		System.out.println(nestedMembers);
	}

	public class Inner {}

}
