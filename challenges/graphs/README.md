# Graphs

A graph is a data structure for storing connected data like a network of people on a social media platform.

A graph consists of vertices and edges. A vertex represents the entity (for example, people) and an edge represents the relationship between entities (for example, a person's friendships).

![graph](./graph1.jpg)

Here, we've defined a simple graph with five vertices and six edges. The circles are vertices representing people and the lines connecting two vertices are edges representing friends on an online portal.

## Graphs Implementation

Implement your own Graph. The graph should be represented as an adjacency list.


## Approach & Efficiency

- addNode: Time complexity O(1), space complexity O(n).
- addEdge: Time complexity O(1), space complexity O(1).
- getNodes: Time complexity O(n), space complexity O(1).
- getNeighbors: Time complexity O(1), space complexity O(1).

## API

- addNode
Arguments: value
Returns: The added node
Add a node to the graph
- addEdge
Arguments: 2 nodes to be connected by the edge, weight
Returns: nothing
Adds a new edge between two nodes in the graph , and assign a weight to the edge
Both nodes should already be in the Graph
- getNodes
Arguments: none
Returns all of the nodes in the graph as a collection.
- get neighbors
Arguments: node
Returns a collection of edges connected to the given node
Include the weight of the connection in the returned collection
- size
Arguments: none
Returns the total number of nodes in the graph