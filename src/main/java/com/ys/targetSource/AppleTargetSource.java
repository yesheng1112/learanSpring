package com.ys.targetSource;

import org.springframework.aop.TargetSource;

import java.util.concurrent.ThreadLocalRandom;

public class AppleTargetSource implements TargetSource {
  private Apple apple1;
  private Apple apple2;

  public AppleTargetSource() {
    this.apple1 = new Apple(1);
    this.apple2 = new Apple(2);
  }

  @Override
  public Class<?> getTargetClass() {
    return Apple.class;
  }

  @Override
  public boolean isStatic() {
    return false;
  }

  @Override
  public Object getTarget() throws Exception {
    ThreadLocalRandom random = ThreadLocalRandom.current();
    int index = random.nextInt(2);
    return index % 2 == 0 ? apple1 : apple2;
  }

  @Override
  public void releaseTarget(Object target) throws Exception {}
}