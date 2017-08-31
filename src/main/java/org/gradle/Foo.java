package org.gradle;

public class Foo {
	private Bar p;
	public void printFoo() {
		System.out.println(p.getName());
	}
	public Foo (Bar p) { this.p = p; }
}