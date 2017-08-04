package org.com.immutable

import scala.math.Ordered

object listSortUserDS {
  def main(args: Array[String]): Unit = {
    val list = List(new Employee(3, "abc", 30000), new Employee(1, "def", 25000), new Employee(2, "ghi", 35000))
    list.foreach(k => println(k.employeeId))
    val newlist = list.sorted
    newlist.foreach(k => println(k.employeeId))

    val newlist1 = list.sorted(new Ordering[Employee] {
      def compare(a: Employee, b: Employee) = {
        a.employeeSalary compare b.employeeSalary
      }
    })
    newlist1.foreach(k => println(k.employeeId))
  }
}

class Employee(id: Int, name: String, salary: Long) extends Ordered[Employee] {
  val employeeId = id
  val employeeName = name
  val employeeSalary = salary

  def compare(a: Employee) = {
    employeeId compare a.employeeId
  }
}