package 数据结构;

import java.util.HashMap;
import java.util.Map;

public class LC146LRU缓存 {
    class LRUCache {
        class LinkNode {
            int key;
            int value;
            LinkNode prev;
            LinkNode next;

            public LinkNode() {
            }

            ;

            public LinkNode(int _key, int _value) {
                key = _key;
                value = _value;
            }
        }

        private Map<Integer, LinkNode> cache = new HashMap<Integer, LinkNode>();
        private int size;
        private int capacity;
        private LinkNode head, tail;

        public LRUCache(int capacity) {
            this.size = 0;
            this.capacity = capacity;
            head = new LinkNode();
            tail = new LinkNode();
            head.next = tail;
            tail.prev = head;
        }

        public void put(int key, int value) {
            LinkNode node = cache.get(key);
            if (node == null) {
                LinkNode temp = new LinkNode(key, value);
                cache.put(key, temp);
                addToHead(temp);
                ++size;
                if (size > capacity) {
                    // 删除最后一个节点，即tail的前一个节点
                    LinkNode tail = removeTail();
                    cache.remove(tail.key);
                    --size;
                }

            } else {
                node.value = value;
                moveToHead(node);
            }

        }

        public int get(int key) {
            if (cache.get(key) == null) {
                return -1;
            } else {
                LinkNode node = cache.get(key);
                moveToHead(node);
                return node.value;
            }
        }

        // 加结点，前后都要加，四个
        public void addToHead(LinkNode node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        public void removeNode(LinkNode node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        // 不区分情况，先删后增加
        public void moveToHead(LinkNode node) {
            removeNode(node);
            addToHead(node);
        }

        public LinkNode removeTail() {
            LinkNode node = tail.prev;
            removeNode(node);
            return node;
        }
    }
}
