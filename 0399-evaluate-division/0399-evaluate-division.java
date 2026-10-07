class Solution {
    class Pair{
        String node;
        Double weight;
        public Pair(String n, Double w){
            this.node =n;
            this.weight = w;
        }
    }

    public static double dfs (String src, String des, Set<String> visited, double product, Map<String, List<Pair>> graph){
        if(src.equals(des)){
            return product;
        }
        visited.add(src);

        for (Pair edge : graph.get(src)) {
            String neighbour = edge.node;
            Double weight = edge.weight;

            if(!visited.contains(neighbour)){
                double res = dfs(neighbour,des,visited, product*weight, graph);

            if(res != -1.0){
                return res;
            }    
            }
            
        }
        return -1.0;
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] res = new double[queries.size()];
        Map<String, List<Pair>> graph = new HashMap<>();
         for (int i=0; i< equations.size();i++) {
            graph.putIfAbsent(equations.get(i).get(0), new ArrayList<>());
            graph.putIfAbsent(equations.get(i).get(1), new ArrayList<>());
            
            graph.get(equations.get(i).get(0)).add(new Pair(equations.get(i).get(1), values[i]));
            graph.get(equations.get(i).get(1)).add(new Pair(equations.get(i).get(0), (1.0/values[i])));
         }

         for(int i=0;i<queries.size();i++){
        Set<String> visited = new HashSet<>();
            double product =1.0;
            String source = queries.get(i).get(0);
            String destiny = queries.get(i).get(1);

            if (!graph.containsKey(source) ||
                !graph.containsKey(destiny)) {
                res[i] = -1.0;
                continue;
            }
            if(!visited.contains(source)){
                res[i] = dfs(source,destiny, visited, product, graph);
            }
         }



        return res;
    }
}