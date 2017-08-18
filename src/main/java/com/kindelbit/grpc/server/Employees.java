package com.kindelbit.grpc.server;

import com.kindelbit.grpc.Employee;

import java.util.ArrayList;

/**
 * Created by josemarmagalhaes on 8/17/17.
 */
public class Employees extends ArrayList<Employee> {

   private static Employees employees;

   public static Employees getInstance() {
      if (employees == null) {
         employees = new Employees();
      }
      return employees;
   }

   private Employees() {
      this.add(Employee.newBuilder()
         .setId(1)
         .setBadgeNumber(2080)
         .setFirstName("Grace")
         .setLastName("Decker")
         .setVacationAccrualRate(2)
         .setVacationAccrued(30)
         .build());

      this.add(Employee.newBuilder()
         .setId(2)
         .setBadgeNumber(7538)
         .setFirstName("Amity")
         .setLastName("Fuller")
         .setVacationAccrualRate(2.3f)
         .setVacationAccrued(23.4f)
         .build());

      this.add(Employee.newBuilder()
         .setId(1)
         .setBadgeNumber(5144)
         .setFirstName("Keaton")
         .setLastName("Willis")
         .setVacationAccrualRate(3)
         .setVacationAccrued(31.7f)
         .build());
   }

}
