cmake_minimum_required(VERSION 3.10)
project(c C)

set(CMAKE_C_STANDARD 11)

include_directories(include)

add_executable(c easy/_155.c)