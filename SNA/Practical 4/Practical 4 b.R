library(igraph)
dg <- graph.formula(1-+2, 1-+3, 2++3)
plot(dg)


graph.density(dg, loops=TRUE)

graph.density(simplify(dg), loops=FALSE)