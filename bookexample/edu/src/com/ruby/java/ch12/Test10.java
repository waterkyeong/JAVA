package com.ruby.java.ch12;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class Test10 {

  public static void main(String[] args) {
    try(RandomAccessFile file = new RandomAccessFile("a.txt", "rw"); 
       FileChannel channel = file.getChannel();) {

      int bufferSize = 1024;

      ByteBuffer buffer = ByteBuffer.allocate(bufferSize);

      WritableByteChannel out = Channels.newChannel(System.out);

      while(channel.read(buffer) != -1) {
        buffer.flip();
        out.write(buffer);
        buffer.clear();
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
