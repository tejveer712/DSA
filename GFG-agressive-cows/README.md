<h2><a href="https://www.geeksforgeeks.org/problems/aggressive-cows/1">Aggressive Cows</a></h2><h3>Medium</h3><hr>

<p>Given an integer array <code>arr[]</code>, which denotes the positions of stalls. All the stall positions are distinct. There are <code>k</code> aggressive cows.</p>

<p>Assign the cows to the stalls such that the <strong>minimum distance</strong> between any two cows is <strong>maximized</strong>.</p>

<p>Return the largest possible minimum distance between any two cows after placing all <code>k</code> cows.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> arr = [1,2,4,8,9], k = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong>
Place cows at positions 1, 4, and 8.
The distances are 3 and 4.
The minimum distance is 3, which is the maximum possible.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> arr = [10,1,2,7,5], k = 3
<strong>Output:</strong> 4
<strong>Explanation:</strong>
After sorting the stalls, place cows at positions 1, 5, and 10.
The minimum distance between any two cows is 4, which is the maximum possible.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<ul>
    <li><code>2 &lt;= arr.length &lt;= 10<sup>6</sup></code></li>
    <li><code>0 &lt;= arr[i] &lt;= 10<sup>8</sup></code></li>
    <li><code>2 &lt;= k &lt;= arr.length</code></li>
</ul>