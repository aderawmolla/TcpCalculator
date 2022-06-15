<script >
import { ref } from "vue";
import { useMutation } from "@vue/apollo-composable";
import gql from "graphql-tag";

export default {
  setup() {
     const id=ref(0)
    const {mutate: getPage} = useMutation(
      gql`
        mutation getPage($id:Int!) {
          getPage(id:$id) {
            id
            title
            description
            image_url
          }
        }
      `,
      () => ({
        variables: {
          id:id.value,
        },
      })
    )
    return {
      id,
      getPage,
    }
  },
};
</script>
<template>

  <div class="container mx-auto border-solid ">
    <div class="max-w-xl p-5 mx-auto my-10 bg-darkgreen rounded-md shadow border-solid border-2 border-brown-600 ..." > 
    
           <label for="id" title=" block mb-2 text-sm text-gray-600"
            >enter page id you want to see</label
           >
           <input v-model="id"
            
            placeholder="Enter the title of id of the page to be deleted"
            required
            class="w-full px-3 py-2 placeholder-gray-300 border border-gray-300 rounded-md  focus:outline-none focus:ring focus:ring-indigo-100 focus:border-indigo-300 m-4"
           />
         <div class="mb-6">
            <button
            @click="getPage()"
             class="w-1000 hover:bg-sky-800 ... px-10 py-4 text-white bg-indigo-500 rounded-md  focus:bg-indigo-600 focus:outline-blue" 
            > 
            Get_Single_Page
           </button>
          </div>
    </div> 
  </div>
  <div>
  <span class="m m-2 italic capitalize h-200 bg-green-300 w-200 overflow-x-auto border-8 rounded-lg border-indigo-400"><b>id: </b>{{ page.id }} </span><br />
      <span> <b>title: </b>{{ page.title }} </span><br />
      <span> <b>description: </b>{{ page.description }} </span><br />
      <span> <b>image_url: </b>{{ page.image_url }} </span><br />
  </div>
  <router-view> </router-view>
</template>