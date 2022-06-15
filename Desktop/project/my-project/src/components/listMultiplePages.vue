<script>
import { useQuery } from "@vue/apollo-composable";
import gql from "graphql-tag";
export default {
  setup() {
    const {result} = useQuery(gql`
      query getAllPages {
        getAllPages {
          id
          title
          description
          image_url
        }
      }
    `);
  return{
    result
  }
}
};
</script>
<template>
  <div v-if="error">Something went wrong...</div>
  <div v-if="loading">Loading...</div>
  <div class="flex flex-wrap shadow-lg shadow-green-100 m-2 gap-4">
    <div
      class="m m-2 italic capitalize h-200 bg-green-300 w-200 overflow-x-auto border-8 rounded-lg border-indigo-400"
      v-for="page in result.getAllPages"
      :key="page.id"
    >
      <span class=""><b>id: </b>{{ page.id }} </span><br />
      <span> <b>title: </b>{{ page.title }} </span><br />
      <span> <b>description: </b>{{ page.description }} </span><br />
      <span> <b>image_url: </b>{{ page.image_url }} </span><br />
     </div>
     </div>
     <router-view> </router-view>
  </template>