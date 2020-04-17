<header class="entry-header">
<h1 class="entry-title" style="text-align: center;">Object Oriented Programming (OOPs) Concept in Java</h1>
</header>
<div class="entry-content">
<p><strong>Object-oriented programming:</strong>&nbsp;As the name suggests, Object-Oriented Programming or OOPs refers to languages that uses objects in programming. Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism etc in programming. The main aim of OOP is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function.</p>
<p><strong>OOPs Concepts:</strong></p>
<ul>
<li><a href="https://www.geeksforgeeks.org/polymorphism-in-java/">Polymorphism</a></li>
<li><a href="https://www.geeksforgeeks.org/inheritance-in-java/">Inheritance</a></li>
<li><a href="https://www.geeksforgeeks.org/encapsulation-in-java/">Encapsulation</a></li>
<li><a href="https://www.geeksforgeeks.org/abstraction-in-java-2/">Abstraction</a></li>
<li><a href="https://www.geeksforgeeks.org/classes-objects-java/">Class</a></li>
<li><a href="https://www.geeksforgeeks.org/classes-objects-java/">Object</a></li>
<li><a href="https://www.geeksforgeeks.org/methods-in-java/">Method</a></li>
<li><a href="https://www.geeksforgeeks.org/message-passing-in-java/">Message Passing</a></li>
</ul>
<p><a href="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190717114649/Object-Oriented-Programming-Concepts.jpg"><img class="aligncenter size-full wp-image-323004" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190717114649/Object-Oriented-Programming-Concepts.jpg" sizes="(max-width: 601px) 100vw, 601px" srcset="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190717114649/Object-Oriented-Programming-Concepts.jpg 601w, https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190717114649/Object-Oriented-Programming-Concepts-100x100.jpg 100w, https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190717114649/Object-Oriented-Programming-Concepts-300x300.jpg 300w" alt="" width="601" height="601" /></a></p>
<br />
<div id="AP_G4GR_5">&nbsp;</div>
<br />
<p>Let us learn about the different characteristics of an Object-Oriented Programming language:</p>
<ol>
<li><strong><a href="https://www.geeksforgeeks.org/polymorphism-in-java/">Polymorphism</a>:</strong>&nbsp;Polymorphism refers to the ability of OOPs programming languages to differentiate between entities with the same name efficiently. This is done by Java with the help of the signature and declaration of these entities.
<p><strong>For example:</strong></p>
<div class="code-block">
<div class="code-gutter">
<div class="editor-buttons-container">
<div class="editor-buttons">
<div class="editor-buttons-div" title="Run and Edit"><em id="copy-code-button" class="material-icons code-sidebar-button copy-code-button" title="Copy Code">filter_none</em>
<p><em id="run-and-edit-button" class="material-icons code-sidebar-button" lang="java" title="Edit Code">edit</em></p>
<p><em id="run-code-button" class="material-icons code-sidebar-button" lang="java" title="Run Code and See Output">play_arrow</em></p>
<p><em class="material-icons code-sidebar-button dark-editor-button" title="Dark Mode">brightness_4</em></p>
</div>
</div>
</div>
</div>
<div class="code-container">
<div id="highlighter_453053" class="syntaxhighlighter nogutter  ">
<table border="0" cellspacing="0" cellpadding="0">
<tbody>
<tr>
<td class="code">
<div class="container">
<div class="line number1 index0 alt2"><code class="comments">// Java program to demonstrate Polymorphism </code></div>
<div class="line number2 index1 alt1"><code class="undefined spaces">&nbsp;</code>&nbsp;</div>
<div class="line number3 index2 alt2"><code class="comments">// This class will contain </code></div>
<div class="line number4 index3 alt1"><code class="comments">// 3 methods with same name, </code></div>
<div class="line number5 index4 alt2"><code class="comments">// yet the program will </code></div>
<div class="line number6 index5 alt1"><code class="comments">// compile &amp; run successfully </code></div>
<div class="line number7 index6 alt2"><code class="keyword">public</code> <code class="keyword">class</code> <code class="plain">Sum { </code></div>
<div class="line number8 index7 alt1"><code class="undefined spaces">&nbsp;</code>&nbsp;</div>
<div class="line number9 index8 alt2"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="comments">// Overloaded sum(). </code></div>
<div class="line number10 index9 alt1"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="comments">// This sum takes two int parameters </code></div>
<div class="line number11 index10 alt2"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="keyword">public</code> <code class="keyword">int</code> <code class="plain">sum(</code><code class="keyword">int</code> <code class="plain">x, </code><code class="keyword">int</code> <code class="plain">y) </code></div>
<div class="line number12 index11 alt1"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="plain">{ </code></div>
<div class="line number13 index12 alt2"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="keyword">return</code> <code class="plain">(x + y); </code></div>
<div class="line number14 index13 alt1"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="plain">} </code></div>
<div class="line number15 index14 alt2"><code class="undefined spaces">&nbsp;</code>&nbsp;</div>
<div class="line number16 index15 alt1"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="comments">// Overloaded sum(). </code></div>
<div class="line number17 index16 alt2"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="comments">// This sum takes three int parameters </code></div>
<div class="line number18 index17 alt1"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="keyword">public</code> <code class="keyword">int</code> <code class="plain">sum(</code><code class="keyword">int</code> <code class="plain">x, </code><code class="keyword">int</code> <code class="plain">y, </code><code class="keyword">int</code> <code class="plain">z) </code></div>
<div class="line number19 index18 alt2"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="plain">{ </code></div>
<div class="line number20 index19 alt1"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="keyword">return</code> <code class="plain">(x + y + z); </code></div>
<div class="line number21 index20 alt2"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="plain">} </code></div>
<div class="line number22 index21 alt1"><code class="undefined spaces">&nbsp;</code>&nbsp;</div>
<div class="line number23 index22 alt2"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="comments">// Overloaded sum(). </code></div>
<div class="line number24 index23 alt1"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="comments">// This sum takes two double parameters </code></div>
<div class="line number25 index24 alt2"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="keyword">public</code> <code class="keyword">double</code> <code class="plain">sum(</code><code class="keyword">double</code> <code class="plain">x, </code><code class="keyword">double</code> <code class="plain">y) </code></div>
<div class="line number26 index25 alt1"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="plain">{ </code></div>
<div class="line number27 index26 alt2"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="keyword">return</code> <code class="plain">(x + y); </code></div>
<div class="line number28 index27 alt1"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="plain">} </code></div>
<div class="line number29 index28 alt2"><code class="undefined spaces">&nbsp;</code>&nbsp;</div>
<div class="line number30 index29 alt1"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="comments">// Driver code </code></div>
<div class="line number31 index30 alt2"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="keyword">public</code> <code class="keyword">static</code> <code class="keyword">void</code> <code class="plain">main(String args[]) </code></div>
<div class="line number32 index31 alt1"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="plain">{ </code></div>
<div class="line number33 index32 alt2"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="plain">Sum s = </code><code class="keyword">new</code> <code class="plain">Sum(); </code></div>
<div class="line number34 index33 alt1"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="plain">System.out.println(s.sum(</code><code class="value">10</code><code class="plain">, </code><code class="value">20</code><code class="plain">)); </code></div>
<div class="line number35 index34 alt2"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="plain">System.out.println(s.sum(</code><code class="value">10</code><code class="plain">, </code><code class="value">20</code><code class="plain">, </code><code class="value">30</code><code class="plain">)); </code></div>
<div class="line number36 index35 alt1"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="plain">System.out.println(s.sum(</code><code class="value">10.5</code><code class="plain">, </code><code class="value">20.5</code><code class="plain">)); </code></div>
<div class="line number37 index36 alt2"><code class="undefined spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="plain">} </code></div>
<div class="line number38 index37 alt1"><code class="plain">} </code></div>
</div>
</td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="outputDiv"><strong>Output:</strong>
<pre>30
60
31.0
</pre>
</div>
<p>Polymorphism in Java are mainly of 2 types:</p>
<ul>
<li><a href="https://www.geeksforgeeks.org/overloading-in-java/">Overloading in Java</a></li>
<li><a href="https://www.geeksforgeeks.org/overriding-in-java/">Overriding in Java</a></li>
</ul>
</li>
<li><strong><a href="https://www.geeksforgeeks.org/inheritance-in-java/">Inheritance</a>:</strong>&nbsp;Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.<br /><strong>Important terminology:<br /></strong>
<ul>
<li><strong>Super Class:&nbsp;</strong>The class whose features are inherited is known as superclass(or a base class or a parent class).</li>
<li><strong>Sub Class:</strong>&nbsp;The class that inherits the other class is known as subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.</li>
<li><strong>Reusability:&nbsp;</strong>Inheritance supports the concept of &ldquo;reusability&rdquo;, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.</li>
</ul>
<p>The keyword used for inheritance is&nbsp;<strong>extends</strong>.<br /><strong>Syntax:</strong></p>
<pre>class derived-class <strong>extends</strong> base-class  
{  
   //methods and fields  
}  
</pre>
</li>
<li><strong><a href="https://www.geeksforgeeks.org/encapsulation-in-java/">Encapsulation</a>:</strong>&nbsp;Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield.
<ul>
<li>Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared.</li>
<li>As in encapsulation, the data in a class is hidden from other classes, so it is also known as&nbsp;<strong>data-hiding</strong>.</li>
<li>Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.</li>
</ul>
<p><a href="https://media.geeksforgeeks.org/wp-content/uploads/Encapsulation.jpg"><img class="aligncenter size-full wp-image-162580" src="https://media.geeksforgeeks.org/wp-content/uploads/Encapsulation.jpg" alt="Encapsulation" width="225" height="225" /></a></p>
</li>
<li><strong><a href="https://www.geeksforgeeks.org/abstraction-in-java-2/">Abstraction</a>:</strong>&nbsp;Data Abstraction is the property by virtue of which only the essential details are displayed to the user.The trivial or the non-essentials units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components.
<p>Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. The properties and behaviours of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.</p>
<p>Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase the speed of car or applying brakes will stop the car but he does not know about how on pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of accelerator, brakes etc in the car. This is what abstraction is.</p>
<p>In java, abstraction is achieved by&nbsp;<a href="https://www.geeksforgeeks.org/interfaces-in-java/">interfaces</a>&nbsp;and&nbsp;<a href="https://www.geeksforgeeks.org/abstract-classes-in-java/">abstract classes</a>. We can achieve 100% abstraction using interfaces.</p>
<br />
<div id="AP_G4GR_6">&nbsp;</div>
</li>
<li><strong><a href="https://www.geeksforgeeks.org/classes-objects-java/">Class</a>:</strong>&nbsp;A class is a user defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order:
<ol>
<li><strong>Modifiers</strong>: A class can be public or has default access (Refer&nbsp;<a href="https://www.geeksforgeeks.org/access-specifiers-for-classes-or-interfaces-in-java/">this</a>&nbsp;for details).</li>
<li><strong>Class name:</strong>&nbsp;The name should begin with a initial letter (capitalized by convention).</li>
<li><strong>Superclass(if any):</strong>&nbsp;The name of the class&rsquo;s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.</li>
<li><strong>Interfaces(if any):</strong>&nbsp;A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.</li>
<li><strong>Body:</strong>&nbsp;The class body surrounded by braces, { }.</li>
</ol>
</li>
<li><strong><a href="https://www.geeksforgeeks.org/classes-objects-java/">Object</a>:</strong>&nbsp;It is a basic unit of Object Oriented Programming and represents the real life entities. A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of:
<ol>
<li><strong>State&nbsp;</strong>: It is represented by attributes of an object. It also reflects the properties of an object.</li>
<li><strong>Behavior&nbsp;</strong>: It is represented by methods of an object. It also reflects the response of an object with other objects.</li>
<li><strong>Identity&nbsp;</strong>: It gives a unique name to an object and enables one object to interact with other objects.</li>
</ol>
<p>Example of an object: dog</p>
<p><a href="https://media.geeksforgeeks.org/wp-content/uploads/Blank-Diagram-Page-1-5.png"><img class="alignnone size-full wp-image-160565" src="https://media.geeksforgeeks.org/wp-content/uploads/Blank-Diagram-Page-1-5.png" alt="Blank Diagram - Page 1 (5)" width="1102" height="310" /></a></p>
</li>
<li><strong><a href="https://www.geeksforgeeks.org/methods-in-java/">Method</a>:</strong>&nbsp;A method is a collection of statements that perform some specific task and return result to the caller. A method can perform some specific task without returning anything. Methods allow us to&nbsp;<strong>reuse</strong>&nbsp;the code without retyping the code. In Java, every method must be part of some class which is different from languages like C, C++ and Python.<br />Methods are&nbsp;<strong>time savers&nbsp;</strong>and help us to&nbsp;<strong>reuse</strong>&nbsp;the code without retyping the code.
<p style="text-align: center;" align="center"><strong>Method Declaration</strong></p>
<p>In general, method declarations has six components:</p>
<ul>
<li><strong><a href="https://www.geeksforgeeks.org/access-modifiers-java/">Access Modifier</a></strong>: Defines&nbsp;<strong>access type</strong>&nbsp;of the method i.e. from where it can be accessed in your application. In Java, there 4 type of the access specifiers.
<ul>
<li><strong>public:</strong>&nbsp;accessible in all class in your application.</li>
<li><strong>protected:</strong>&nbsp;accessible within the package in which it is defined and in its&nbsp;<strong>subclass(es)(including subclasses declared outside the package)</strong></li>
<li><strong>private:</strong>&nbsp;accessible only within the class in which it is defined.</li>
<li><strong>default (declared/defined without using any modifier):</strong>&nbsp;accessible within same class and package within which its class is defined.</li>
</ul>
</li>
<li><strong>The return type</strong>: The data type of the value returned by the method or void if does not return a value.</li>
<li><strong>Method Name</strong>: the rules for field names apply to method names as well, but the convention is a little different.</li>
<li><strong>Parameter list</strong>: Comma separated list of the input parameters are defined, preceded with their data type, within the enclosed parenthesis. If there are no parameters, you must use empty parentheses ().</li>
<li><strong>Exception list</strong>: The exceptions you expect by the method can throw, you can specify these exception(s).</li>
<li><strong>Method body</strong>: it is enclosed between braces. The code you need to be executed to perform your intended operations.</li>
</ul>
<p><a href="https://media.geeksforgeeks.org/wp-content/uploads/methods-in-java.png"><img class="size-full wp-image-150709 aligncenter" src="https://media.geeksforgeeks.org/wp-content/uploads/methods-in-java.png" alt="methods in java" /></a></p>
</li>
<li><strong><a href="https://www.geeksforgeeks.org/message-passing-in-java/">Message Passing</a>:</strong>&nbsp;Objects communicate with one another by sending and receiving information to each other. A message for an object is a request for execution of a procedure and therefore will invoke a function in the receiving object that generates the desired results. Message passing involves specifying the name of the object, the name of the function and the information to be sent.</li>
</ol>
</div>