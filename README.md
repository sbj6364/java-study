# JAVA-study
Basic Java Comprehension

### String
~~~
String st = "";
String st = new String(""); # use 'new' to make an object
~~~

- `st1.equals(st2)`: Compare whether string st1, st2 are the same
- `st1.indexOf(st2)`: Extracts the starting index of a particular part(st2)
- `st.replaceAll(a,b)`: Replace certain parts(a) of the string(st) with other characters(b)
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
~~~
type[] a = {};
type[] a = new type[n]; # 'n' is the length of the array
~~~
- indexing by `a[index]`
- `a.length`: Return the length of the array(a)
- **The length** of an array is **always fixed**

### List

Similar with Array, but more dynamic.  
**Array List**: The simplest type of list
~~~
ArrayList<type> al = new ArrayList();
~~~
- `al.add(i,object)`: Add object in certain position(i)
- `al.get(i)`: Get value of certain index(i)
- `al.size()`: Return size(numbers of elements) of the Array List
- `al.contains(object)`: Check if the object is included in the Array List, return boolean value
- `al.remove(object)`: Find and remove the object from the Array List, return boolean value
- `al.remove(index)`: Remove the object of certain index, return the object
