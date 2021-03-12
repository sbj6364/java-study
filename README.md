# JAVA-study

Study note for basic JAVA comprehension



## Ⅰ. Type



### String

~~~java
String st = "";
String st = new String(""); # use 'new' to make an object
~~~

- `st1.equals(st2)`: Compare whether string st1, st2 are the same
- `st1.indexOf(st2)`: Extracts the starting index of a particular part(st2)
- `st.replaceAll(a,b)`: Replace certain parts(a) of the string(st) with other characters(b)ⅠⅠ
- `st.substring(i,j)`: Extract a particular part(i <= index < j) of a string(st)
- `st.toUpperCase()`: Replace all string letters to uppercase
- `st.toLowerCase()`: Replace all string letters to lowercase

### StringBuffer
- `toString()`: Change into string type
	- String (immutable)
	- StringBuffer (mutable): Heavier than string
- `sb.append(a)`: Add string(a) at the end of the String Buffer(sb)
- `sb.insert(a)`: Insert string(a) into certain index of the String Buffer(sb)
- `sb.substring(i,j)`: Extract a particular part(i <= index < j) of the String Buffer(sb)

### Array
~~~java
type[] a = {};
type[] a = new type[n]; # 'n' is the length of the array
~~~
- indexing by `a[index]`
- `a.length`: Return the length of the array(a)
- **The length** of an array is **always fixed**

### List

Similar with Array, but more dynamic.  
**Array List**: The simplest type of list
~~~java
ArrayList<type> al = new ArrayList();
~~~
- `al.add(i,object)`: Add object in certain position(i)
- `al.get(i)`: Get value of certain index(i)
- `al.size()`: Return size(numbers of elements) of the Array List
- `al.contains(object)`: Check if the object is included in the Array List, return boolean value
- `al.remove(object)`: Find and remove the object from the Array List, return boolean value
- `al.remove(index)`: Remove the object of certain index, return the object

### Generics
~~~java
ArrayList<Type> alist = new ArrayList<Type>();
~~~
Use generics to check specific type  

- **Non-generics code**
~~~java
ArrayList aList = new ArrayList();
aList.add("hello");
aList.add("java");

String hello = (String) aList.get(0); // Casting object into string
String java = (String) aList.get(1);
~~~

- **Generics code**
~~~java
ArrayList<String> aList = new ArrayList<String>();
aList.add("hello");
aList.add("java");

String hello = aList.get(0); // No need to change type
String java = aList.get(1);
~~~

### Map

A.K.A **Hash**, **Associative array**

|Key|Value|
|:---:|:---:|
|first name|Seo|
|Birthday|19981126|

**Hash Map**: The simplest type of map
~~~java
HashMap<Type, Type> map = new HashMap<Type, Type>();
~~~
- `map.put(k,v)`: Input key(k) and value(v)
- `map.get(k)`: Return value of the key(k)
- `map.containsKey(k)`: Check if the key(k) is included in the map, return boolean value
- `map.remove(k)`: Remove the item(key, value) from the map, return the value
- `map.size()`: Return size(number of items) of the map
  

The biggest feature of Map is its import of value into the key without relying on the sequence.  
Sometimes, however, you may want to import data in the order in which it is entered in Map, and sometimes you may want to import data sorted by the key entered.  

In these cases,
- **Linked HashMap**: Output data sequence is same as Input's
- **Tree Map**: Output data sequence in the sorted order of the keys entered







## Ⅱ. Control Statement



### if



> "If you have money, take a cab. If not, walk."



- Script

~~~java
public class test {
    public static void main(String[] args) {
        boolean money = true;

        if (money) { // since money is true,
            System.out.println("Take a cab"); // 'if' works
        } else { // if not, (false)
            System.out.println("Walk"); // 'else' doesn't work
        }
    }
}

~~~

- Output

~~~java
Take a cab
~~~



**Basic Structure**

~~~java
if (condition) {
    <order1>
    <order2>
    ...
} else {
    <orderA>
    <orderB>
    ...
}
~~~

We can also add `elseif{}`.

`contains()` method makes good work with `if`.



**Comparison Operator**

Same as python, C, ... and more

| Operator |               Description                |
| :------: | :--------------------------------------: |
|  x < y   |         **x** is less than **y**         |
|  x > y   |       **x** is greater than **y**        |
|  x == y  |         **x** is equal to **y**          |
|  x != y  |        **x** isn't equal to **y**        |
|  x >= y  | **x** is greater than or equal to  **y** |
|  x <= y  |   **x** is less than or equal to **y**   |





### Switch/Case



Same as others.

~~~java
switch(var) {
    case value1: ...
         break;
    case value2: ...
         break;
    ...
    default: ...
         break;
}
~~~



- One of the good examples of switch/case

```java

public class SwitchDemo {
	public static void main(String[] args) {
    int month = 8;
    String monthString = "";
    switch (month) {
        case 1:  monthString = "January";
                 break;
        case 2:  monthString = "February";
                 break;
        case 3:  monthString = "March";
                 break;
        case 4:  monthString = "April";
                 break;
        case 5:  monthString = "May";
                 break;
        case 6:  monthString = "June";
                 break;
        case 7:  monthString = "July";
                 break;
        case 8:  monthString = "August";
                 break;
        case 9:  monthString = "September";
                 break;
        case 10: monthString = "October";
                 break;
        case 11: monthString = "November";
                 break;
        case 12: monthString = "December";
                 break;
        default: monthString = "Invalid month";
                 break;
    }
    System.out.println(monthString);
	}
}
```




### While



Same as others.

~~~java
while (condition) {
    <order1>
    <order2>
    <order3>
    ...
}
~~~



- Infinite Loop

  ~~~java
  while (true) {
      System.out.println("Press Ctrl-C!");
  }
  ~~~

- `break` to break out.
- `continue` to return to the conditional statement





### For



~~~java
for (initial value; condition; increasing value)
~~~



- Multiplication table

  ~~~java
  for(int i=2; i<10; i++) {
      for(int j=1; j<10; j++) {
          System.out.print(i*j+" "); // not including '\n'
      }
      System.out.println(""); // including '\n'
  }
  ~~~

- For each

  ~~~java
  for (type var: iterate) {
      body-of-loop
  }
  ~~~

  Simple, but cannot specify the number of iterations or the increasing value.