package com.min.edu.anno05;

public class Student {

		private String name;
		private String addr;
		private int age;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(String name, String addr, int age) {
			super();
			this.name = name;
			this.addr = addr;
			this.age = age;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", addr=" + addr + ", age=" + age + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
}
