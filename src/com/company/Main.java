package com.company;

public class Main {

    public static void main(String[] args) {
      LogManager manager = new LogManager(new JustSystemOutPrint());//Внедряется зависимость через конструктор.
      manager.log("message");//пишем в логгер сообщение (на выходе что-то вроде Tue Dec 21 20:49:47 MSK 2021: message)
      LogManager manager2 = new LogManager(new JavaUtilLogger());//Создаём ещё один экземпляр, но передаём уже другой экземпляр логгера
      manager2.log("message");//и сообщение отправляется уже другим образом (дек. 21, 2021 8:49:48 PM com.company.ExtraLogger log WARNING: Tue Dec 21 20:49:48 MSK 2021: message)
    }
}
