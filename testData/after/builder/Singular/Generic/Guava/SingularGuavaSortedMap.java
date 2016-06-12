// Generated by delombok at Sat Jun 11 16:42:02 CEST 2016

import com.google.common.collect.ImmutableSortedMap;

public class SingularGuavaSortedMap<A, B> {
  private ImmutableSortedMap rawTypes;
  private ImmutableSortedMap<Integer, Float> integers;
  private ImmutableSortedMap<A, B> generics;
  private ImmutableSortedMap<? extends Number, ? extends String> extendsGenerics;

  public static void main(String[] args) {
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  SingularGuavaSortedMap(final ImmutableSortedMap rawTypes, final ImmutableSortedMap<Integer, Float> integers, final ImmutableSortedMap<A, B> generics, final ImmutableSortedMap<? extends Number, ? extends String> extendsGenerics) {
    this.rawTypes = rawTypes;
    this.integers = integers;
    this.generics = generics;
    this.extendsGenerics = extendsGenerics;
  }


  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public static class SingularGuavaSortedMapBuilder<A, B> {
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableSortedMap.Builder<java.lang.Object, java.lang.Object> rawTypes;
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableSortedMap.Builder<Integer, Float> integers;
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableSortedMap.Builder<A, B> generics;
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableSortedMap.Builder<Number, String> extendsGenerics;

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    SingularGuavaSortedMapBuilder() {
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedMapBuilder<A, B> rawType(final java.lang.Object key, final java.lang.Object value) {
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableSortedMap.naturalOrder();
      this.rawTypes.put(key, value);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedMapBuilder<A, B> rawTypes(final java.util.Map<?, ?> rawTypes) {
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableSortedMap.naturalOrder();
      this.rawTypes.putAll(rawTypes);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedMapBuilder<A, B> clearRawTypes() {
      this.rawTypes = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedMapBuilder<A, B> integer(final Integer key, final Float value) {
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableSortedMap.naturalOrder();
      this.integers.put(key, value);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedMapBuilder<A, B> integers(final java.util.Map<? extends Integer, ? extends Float> integers) {
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableSortedMap.naturalOrder();
      this.integers.putAll(integers);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedMapBuilder<A, B> clearIntegers() {
      this.integers = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedMapBuilder<A, B> generic(final A key, final B value) {
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableSortedMap.naturalOrder();
      this.generics.put(key, value);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedMapBuilder<A, B> generics(final java.util.Map<? extends A, ? extends B> generics) {
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableSortedMap.naturalOrder();
      this.generics.putAll(generics);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedMapBuilder<A, B> clearGenerics() {
      this.generics = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedMapBuilder<A, B> extendsGeneric(final Number key, final String value) {
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableSortedMap.naturalOrder();
      this.extendsGenerics.put(key, value);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedMapBuilder<A, B> extendsGenerics(final java.util.Map<? extends Number, ? extends String> extendsGenerics) {
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableSortedMap.naturalOrder();
      this.extendsGenerics.putAll(extendsGenerics);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedMapBuilder<A, B> clearExtendsGenerics() {
      this.extendsGenerics = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedMap<A, B> build() {
      com.google.common.collect.ImmutableSortedMap<java.lang.Object, java.lang.Object> rawTypes = this.rawTypes == null ? com.google.common.collect.ImmutableSortedMap.<java.lang.Object, java.lang.Object>of() : this.rawTypes.build();
      com.google.common.collect.ImmutableSortedMap<Integer, Float> integers = this.integers == null ? com.google.common.collect.ImmutableSortedMap.<Integer, Float>of() : this.integers.build();
      com.google.common.collect.ImmutableSortedMap<A, B> generics = this.generics == null ? com.google.common.collect.ImmutableSortedMap.<A, B>of() : this.generics.build();
      com.google.common.collect.ImmutableSortedMap<Number, String> extendsGenerics = this.extendsGenerics == null ? com.google.common.collect.ImmutableSortedMap.<Number, String>of() : this.extendsGenerics.build();
      return new SingularGuavaSortedMap<A, B>(rawTypes, integers, generics, extendsGenerics);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public java.lang.String toString() {
      return "SingularGuavaSortedMap.SingularGuavaSortedMapBuilder(rawTypes=" + this.rawTypes + ", integers=" + this.integers + ", generics=" + this.generics + ", extendsGenerics=" + this.extendsGenerics + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public static <A, B> SingularGuavaSortedMapBuilder<A, B> builder() {
    return new SingularGuavaSortedMapBuilder<A, B>();
  }
}