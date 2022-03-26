net<-graph.data.frame(d=links,vertices=nodes,directed = T)
m=as.matrix(net)
get.adjacency(m)


plot(net)