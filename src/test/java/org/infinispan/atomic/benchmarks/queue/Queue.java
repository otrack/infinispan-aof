package org.infinispan.atomic.benchmarks.queue;

import org.infinispan.atomic.Distributed;
import org.infinispan.atomic.Key;
import org.infinispan.atomic.ReadOnly;

import java.util.*;

/**
 * @author Pierre Sutra
 */
@Distributed
public class Queue<E> implements java.util.Queue<E>{

   @Key
   public String name;

   public LinkedList<E> delegate;

   public Queue(){
      delegate = new LinkedList<>();
   }

   public Queue(String name){
      this.name = name;
      delegate = new LinkedList<>();
   }

   @Override
   public int size() {
      return delegate.size();
   }

   @Override
   public boolean isEmpty() {
      return delegate.isEmpty();
   }

   @Override
   public boolean contains(Object o) {
      return delegate.contains(o);
   }

   @ReadOnly
   @Override
   public Iterator<E> iterator() {
      return delegate.iterator();
   }

   @Override
   public Object[] toArray() {
      return delegate.toArray();
   }

   @Override
   public <T> T[] toArray(T[] a) {
      return (T[]) delegate.toArray();
   }

   @Override
   public boolean add(E e) {
      return delegate.add(e);
   }

   @Override
   public boolean remove(Object o) {
      return delegate.remove(o);
   }

   @Override
   public boolean containsAll(Collection<?> c) {
      return delegate.containsAll(c);
   }

   @Override
   public boolean addAll(Collection<? extends E> c) {
      return delegate.addAll(c);
   }

   @Override
   public boolean removeAll(Collection<?> c) {
      return delegate.removeAll(c);
   }

   @Override
   public boolean retainAll(Collection<?> c) {
      return delegate.retainAll(c);
   }

   @Override
   public void clear() {
      delegate.clear();
   }

   @Override
   public boolean offer(E e) {
      return delegate.offer(e);
   }

   @Override
   public E remove() {
      return delegate.remove();
   }

   @Override
   public E poll() {
      return delegate.poll();
   }

   @Override
   public E element() {
      return delegate.element();
   }

   @Override
   public E peek() {
      return delegate.peek();
   }
}