# HACKATHON 02

This section contains the solution to the second hackathon.

The challenge is detailed in the previous section and their answers are detailed below.

## Resolution

## The Graph based on the previous table

Image

### 1 - List of Vertices

- 1
- 2
- 3
- 4
- 5
- 6
- 7

### 2 - List of Edges

- 1-2 
- 2-3
- 3-4
- 3-7 
- 3-5
- 5-6
- 4-6
- 6-8
- 8-9

### 3 - Loops? No

### 4 - Directed? Yes

### 5 - Entry and Exit Degree:

| Vertex | Entry Degree | Exit Degree |
|:------:|:------------:|:-----------:|
|    1   |       0      |      1      |
|    2   |       1      |      1      |
|    3   |       1      |      3      |
|    4   |       1      |      1      |
|    5   |       1      |      1      |
|    6   |       2      |      1      |
|    7   |       1      |      1      |
|    8   |       1      |      1      |
|    9   |       2      |      0      |

### 6 - Pending Vertex? Yes

### 7 - Isolated Vertex? No

### 8 - List of neighbors of each vertex:

| Vertex |  Neighbors |
|:------:|:----------:|
|    1   |      2     |
|    2   |   1 and 3  |
|    3   | 2, 4 and 7 |
|    4   |   3 and 6  |
|    5   |   3 and 6  |
|    6   | 5, 4 and 8 |
|    7   |   3 and 9  |
|    8   |   6 and 9  |
|    9   |   7 and 8  |


### 9 - List of neighbors of each edge:

| Edge |      Neighbors     |
|:----:|:------------------:|
|  1-2 |         2-3        |
|  2-3 | 1-2, 3-4, 3-5, 3-7 |
|  3-4 | 2-3, 3-7, 3-5, 4-6 |
|  3-5 |   2-3,3-7,3-4,5-6  |
|  3-7 |   2-3,3-5,3-4,7-9  |
|  4-6 |     3-4,5-6,6-8    |
|  5-6 |     3-5,4-6,6-8    |
|  6-8 |     4-6,5-6,8-9    |
|  8-9 |       6-8,7-9      |



### 10 - Multi graph? No

### 11 - Degree Sequence of the graph
- Entry Degree: 0, 1, 1, 1, 1, 2, 1, 1, 2
- Exit Degree: 1, 1, 3, 1, 1, 1, 1, 1, 0