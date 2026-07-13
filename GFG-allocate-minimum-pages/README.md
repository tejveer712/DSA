<h2><a href="https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages/">Allocate Minimum Pages</a></h2><h3>Medium</h3><hr>

<p>Given an array <code>arr[]</code> of integers, where each element <code>arr[i]</code> represents the number of pages in the <code>i</code>-th book, and an integer <code>k</code> representing the number of students, allocate the books such that:</p>

<ul>
	<li>Each student receives <strong>at least one book</strong>.</li>
	<li>Each student is assigned a <strong>contiguous sequence of books</strong>.</li>
	<li>No book is assigned to more than one student.</li>
	<li>All books must be allocated.</li>
</ul>

<p>Return the <strong>minimum possible value of the maximum number of pages assigned to any student</strong>. If it is not possible to allocate books to all students, return <strong>-1</strong>.</p>

<p><strong>Note:</strong> Test cases are generated such that the answer fits in a 32-bit integer.</p>

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> arr = [12, 34, 67, 90], k = 2
<strong>Output:</strong> 113</pre>

<p><strong>Explanation:</strong></p>
<pre>[12] | [34, 67, 90]      -> Maximum Pages = 191
[12, 34] | [67, 90]      -> Maximum Pages = 157
[12, 34, 67] | [90]      -> Maximum Pages = 113
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> arr = [15, 17, 20], k = 5
<strong>Output:</strong> -1</pre>

<p><strong>Explanation:</strong> There are more students than books, so allocation is impossible.</p>

<p><strong>Constraints:</strong></p>
<ul>
	<li><code>1 &lt;= arr.length &lt;= 10^6</code></li>
	<li><code>1 &lt;= arr[i], k &lt;= 10^4</code></li>
</ul>
```