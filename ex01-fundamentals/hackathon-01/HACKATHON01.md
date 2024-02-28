# HACKATHON 01

This section contains the solution to the first hackathon.

The challenge is detailed in the previous section and their answers are detailed below.

## Resolution

### 1 - List of Vertices

- 1
- 2
- 3
- 4
- 5
- 6
- 7

### 2 - List of Edges

- a1
- a2
- a3
- a4
- a5
- a6
- a7

### 3 - Loops? None

### 4 - Directed? No

### 5 - Degree of each vertex

- 1 - 1
- 2 - 2
- 3 - 3
- 4 - 2
- 5 - 3
- 6 - 2
- 7 - 1

### 6 - Pendant vertex? Yes

### 7 - Isolated vertex? No

### 8 - Neighbors of each vertex

| Vertex | Neighbors |
|:------:|:---------:|
|   1    |     2     |
|   2    |   1, 3    |
|   3    |  2, 4, 5  |
|   4    |   3, 5    |
|   5    |  3, 4, 6  |
|   6    |   5, 7    |
|   7    |     6     |


### 9 - Neighbors of each edge
| Edge |   Neighbors    |
|:----:|:--------------:|
|  a1  |       a2       |
|  a2  |   a1, a3, a5   |
|  a3  |   a2, a5, a4   |
|  a4  |   a3, a5, a6   |
|  a5  | a2, a3, a4, a6 |
|  a6  |   a5, a4, a7   |
|  a7  |       a6       |


### 10 - Multi graph? No

### 11 - Degree sequence: 1, 2, 3, 2, 3, 2, 1

### 12 - Real World situation: A route that can be traced by a taxi
