package com.ruby.java.ch12;

import java.io.File;
import java.io.PrintWriter;

public class Test06 {

  public static void main(String[] args) {
    try {
      File dir = new File("c:\\work");
      dir.mkdir();

      File file = new File(dir, "file1.txt");
      file.createNewFile();

      // ���� �Ǵ� ���͸� ���� �Ǵ�
      if(dir.isDirectory())
        System.out.println(dir.getName() + "�� ���͸��Դϴ�.");
      if(file.isFile())
        System.out.println(file.getName() + "�� �����Դϴ�.");

      // ���Ͽ� ������ ��� �� �б�
      if(file.exists()) {
        try(PrintWriter out = new PrintWriter(file)) {
          out.println("hello java!");
        }
        System.out.println("���� �̸� : " + file.getName());
        System.out.println("���� ��� : " + file.getPath());
        System.out.println("���� ���� : " + file.canWrite());
        System.out.println("�б� ���� : " + file.canRead());
        System.out.println("���� ���� : " + file.length() + " ����Ʈ");

      } else {
        System.out.println("�۾��� ������ �������� ����");
      }

      File subDir = new File("c:\\work\\subDir");
      subDir.mkdir();
      File file2 = new File(subDir, "file2.txt");
      file2.createNewFile();

      // ���� ���� ���
      String file2Path = file2.getAbsolutePath();
      System.out.println("���� ��� : " + file2Path);

      // �θ� ���͸�
      String parentDir = file2.getParent();
      System.out.println("�θ� ��� : " + parentDir);

      // ���͸� ��� ���ϱ�
      File parentFile = file.getParentFile();
      String[] fileNames = parentFile.list();
      System.out.println(parentDir + " ��� ==>");
      for(String name : fileNames) {
        System.out.println(name);
      }

    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
