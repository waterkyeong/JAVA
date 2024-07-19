package com.ruby.java.ch12;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test06_1 {

  public static void main(String[] args) {

    try {

      // ���͸� ����
      Path dir = Paths.get("c:", "work2", "subDir");
      Files.createDirectories(dir);

      // ���� ����
      Path file1 = Paths.get("c:\\work2\\file1.txt");
      Files.createFile(file1);

      // File�� Path�� ��ȯ
      File f1 = new File("c:\\work2\\file1.txt");
      Path p1 = f1.toPath();

      // Path�� File�� ��ȯ
      File f2 = file1.toFile();

      Path file2 = dir.resolve("file2.txt");
      Path normalPath = file2.normalize();  // ����ȭ�� ���
      Path root = file2.getRoot();          // root ���
      Path parent = file2.getParent();      // parent ���
      System.out.println("Path normalize : " + normalPath);
      System.out.println("root ��� : " + root);
      System.out.println("parent ��� : " + parent);

      if(Files.exists(file1)) {  // ��ΰ� �����ϴ��� �˻�
        System.out.println(file1 + " ����");
        try(PrintWriter out = new PrintWriter(f2)) {
          out.println("hello java!");
        }
      }

      if(Files.notExists(file2)) {  // ��ΰ� �������� �ʴ��� �˻�
        System.out.println(file2 + " �������� ����");
      }

      Path file3 = dir.resolve("file3.txt");
      Files.copy(file1, file3);  // ���� ����
      // Files.delete(file3);    // ���� ����

    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}

