#include<stdio.h>
#include<limits.h>

int reverse(int x){
  long result = 0;
  
  // 剥离符号
  int flag = x < 0 ? -1 : 1;
  long target = x;
  target *= flag;

  // 反转数据
  while (target > 0)
  {
    result *= 10;
    result += target % 10;
    target /= 10;
  }

  // 加入符号
  result *= flag;

  // 越界处理
  if (result < INT_MIN || INT_MAX < result)
  {
    result = 0;
  }

  return result;
}