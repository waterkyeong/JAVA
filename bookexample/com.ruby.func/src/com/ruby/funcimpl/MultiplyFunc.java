package com.ruby.funcimpl;

import com.ruby.func.MySubFunc;

public class MultiplyFunc implements MySubFunc {
  public String getName() {
    return "���ϱ�";
  }

  public int func(int a, int b) {
    return a * b;
  }
}
