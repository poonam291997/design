interface Vehicle {
  do();
  stop();
}
class Car implements Vehicle {
  void do() {
  lock();
  go();
  }
  void stop() {
  }
}
class Ship implements Vehicle {
  void do() {
  }
}
class Airplane implements Vehicle {
  void do() {
  }
}
class Tank implements Vehicle {
  void do() {
  }
}

for(Vehicle vehicle : vehicles) {
  vehicle.do();
  vehicle.stop();
}
