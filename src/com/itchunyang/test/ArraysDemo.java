package com.itchunyang.test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by luchunyang on 2016/10/28.
 */
public class ArraysDemo {

    private static int[] intArrays = {11, 45, 66, 1, 3, 62, 35, 22, 9, 78, 21, 44, 69, 33, 66};
    private static Student[] students = {new Student("id is 1", 1), new Student("id is 4", 4), new Student("id is 2", 2), new Student("id is 3", 3)};
    private static Student[] cloneStudents = {new Student("id is 1", 1), new Student("id is 4", 4), new Student("id is 2", 2), new Student("id is 3", 3)};

    public static void main(String[] args) {
//        Arrays.sort(intArrays);//排序 小--->大
//        Arrays.sort(intArrays, 1, intArrays.length - 1);//指定fromindex->toindex排序
//        System.out.println(Arrays.toString(intArrays));


        //排序自定义对象，需要实现Comparable接口，否则报错
//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));

//        Arrays.fill(intArrays,100);//全部fill成100

        //Student[] cloneStudents = students.clone();
        //比较两个数组是否完全相同,包括顺序也要相同
        //System.out.println(Arrays.equals(students,cloneStudents));

        //数组转化为list 这个list不能添加删除元素！！！！
        //这个list会自动跟着元数组而更新的.
        List<Student> list = Arrays.asList(students);
        System.out.println(Arrays.asList("hello", "world", "java", "develop"));

        //二分法查找，前提是要排序好
        Arrays.sort(intArrays);
        int index = Arrays.binarySearch(intArrays, 66);
        System.out.println("find index = " + index);

        //即将原数组拷贝到一个长度为newLength的新数组中，并返回该数组
        System.out.println(Arrays.toString(intArrays));
        int []copy = Arrays.copyOf(intArrays,4);
        System.out.println("copyOf length 4 : " + Arrays.toString(copy));

        //拷贝原始数组的一部分
        copy = Arrays.copyOfRange(intArrays, 1, 3);
        System.out.println("copyOfRange from 1 to 3 : "+ Arrays.toString(copy));

        int[] dest = new int[8];
        //从intArrays 的index=3  拷贝到  dest的index=1处，拷贝5个字节长度
        System.arraycopy(intArrays,3,dest,1,5);
        System.out.println(Arrays.toString(dest));
    }

    static class Student implements Comparable<Student> {
        String name;
        int id;

        public Student(String name, int id) {
            super();
            this.name = name;
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Student other = (Student) obj;
            if (id != other.id)
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "Student [name=" + name + ", id=" + id + "]";
        }

        @Override
        public int compareTo(Student o) {
            // TODO Auto-generated method stub
            return id - o.id; //升序, o.id - id 降序
        }
    }
}
