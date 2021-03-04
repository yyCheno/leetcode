class LRUCache {
    class Node{
        private int key;
        private int value;
        private Node pre;
        private Node next;

        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    private final int capacity;
    private Node head;
    private Node tail;
    private Node node;
    private HashMap<Integer,Node> cacheMap ;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cacheMap = new HashMap<Integer,Node>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.pre = null;
        tail.next = null;
        head.next  = tail;
        tail.pre = head;

    }
    
    public int get(int key) {
        if (cacheMap.containsKey(key)){
            node = cacheMap.get(key);
            //换为链表尾部操作
            moveToTail(node);
           
            return node.value;
        }else{
        
            return -1;
        }
        
    }
    
    public void put(int key, int value) {
        
       if(cacheMap.containsKey(key)){
            Node tmpNode = cacheMap.get(key);
            tmpNode.value = value; 
            moveToTail(tmpNode);
       }else{
           if(cacheMap.size()==capacity){
                cacheMap.remove(head.next.key);
                removeHead();
                node = new Node(key, value);
                addToTail(node);
                cacheMap.put(key, node);
           }else{
               node = new Node(key, value);
                addToTail(node);
                cacheMap.put(node.key,node);
                if(cacheMap.size()==1){
                    head.next  = tail;
                    tail.pre = head;
                }
           }
       }
     

    }

    private void moveToTail(Node node){
        if(node == tail) return;
        node.pre.next = node.next;
        node.next.pre = node.pre;
        node.pre = tail;
        tail.next = node;
        node.next = null;
        tail = node;
       
    }
    private void addToTail(Node node){
        node.pre = tail;
        tail.next = node;
        node.next = null;
        tail = node;
       
    }
    private void removeHead(){
        if(head.next==tail){
        head.pre = null;
        tail.next = null;
        head.next  = tail;
        tail.pre = head;
        return;
        }
        head.next = head.next.next;
        head.next.pre = head;
    }
}