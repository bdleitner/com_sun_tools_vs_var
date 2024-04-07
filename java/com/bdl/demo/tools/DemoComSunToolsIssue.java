package com.bdl.demo.tools;

import com.sun.tools.javac.code.Symbol.ClassSymbol;

/** Demo class to show compile issue when trying to reference com.sun.tools.javac. */
public final class DemoComSunToolsIssue {

  public static void main(String[] args){
    var foo = "foo"; // without language_version flags this is an error
    System.out.printf("%s:%s\n", foo, ClassSymbol.class.getCanonicalName()); // with the flags, this is an error.
  }
}
