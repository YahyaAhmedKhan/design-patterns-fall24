# Observer Pattern

## Definition
The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them of state changes, usually by calling one of their methods. It is mainly used to implement distributed event handling systems.

## Clock Timer Example
In this example, we have a clock timer that notifies its observers every second. The observers are the digital clock and the analog clock. The digital clock prints the time in digital format, and the analog clock prints the time in analog format.

## Code Example

The `ClockTimer` class is the subject that maintains a list of observers and notifies them every second.

```java
ClockTimer clockTimer = new ClockTimer();
DigitalClock digitalClock = new DigitalClock(clockTimer);
AnalogClock analogClock = new AnalogClock(clockTimer);
```

The `DigitalClock` and `AnalogClock` classes are the observers that print the time in digital and analog formats, respectively.


```java
clockTimer.attach(digitalClock); /
clockTimer.attach(analogClock);
```

The above code attaches the digital clock and analog clock to the clock timer.

```java
while (true) {
    clockTimer.tick();
    Thread.sleep(1000);
}
```

## Output
```
Digital time is: 0:0:1 
Analog time is: 0:0:1 
Digital time is: 0:0:2 
Analog time is: 0:0:2 
Digital time is: 0:0:3 
Analog time is: 0:0:3 
...
```


The clock ticks every second, and the observers are notified. The digital clock and analog clock print the time in digital and analog formats, respectively, as they are notified.

```java
clocktimer.detach(digitalClock);
```
The above code detaches the digital clock from the clock timer.
```
Digital time is: 0:0:5 
Analog time is: 0:0:5 
Digital time is: 0:0:6 
Analog time is: 0:0:6 
Analog time is: 0:0:7 
Analog time is: 0:0:8
```


