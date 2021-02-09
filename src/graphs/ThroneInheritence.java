package graphs;

import java.util.*;

class ThroneInheritance {
    Map<String, List<String>> map;
    String root;
    Set<String> set;

    public ThroneInheritance(String kingName) {
        map = new HashMap<>();
        set = new HashSet<>();
        map.putIfAbsent(kingName, new ArrayList());
        root = kingName;
    }

    public void birth(String parentName, String childName) {
        map.get(parentName).add(childName);
        map.putIfAbsent(childName, new ArrayList());
    }

    public void death(String name) {
        set.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(String root, List<String> result) {
        if (!set.contains(root))
            result.add(root);
        for (String child : map.get(root)) {
            dfs(child, result);
        }

    }


    public static void main(String[] args) {
        ThroneInheritance obj = new ThroneInheritance("Krishan");
        obj.birth("Pankaj", "Kshitij");
        obj.death("Kshitij");
        List<String> param = obj.getInheritanceOrder();
    }
}
