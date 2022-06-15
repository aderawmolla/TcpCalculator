<script >
import { ref } from "vue";
import { useMutation } from "@vue/apollo-composable";
import gql from "graphql-tag";

export default {
  setup() {
  
     const id =ref('')
    const {mutate: deletePage} = useMutation(
      gql`
        mutation deletePage($id:Int) {
          deletePage(id:$id) {
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
      deletePage,
    }
  },
};
</script>
<template slot-scope="{ mutate, loading, error">
  <div class="container mx-auto border-solid ">
    <div class="max-w-xl p-5 mx-auto my-10 bg-darkgreen rounded-md shadow border-solid border-2 border-brown-600 ..." > 
    
           <label for="id" title=" block mb-2 text-sm text-gray-600"
            >enter page id you want to delete </label>
           <input v-model="id"
            
            placeholder="Enter the title of id of the page to be deleted"
            required
            class="w-full px-3 py-2 placeholder-gray-300 border border-gray-300 rounded-md  focus:outline-none focus:ring focus:ring-indigo-100 focus:border-indigo-300 m-4"/>
           <div class="mb-6">
            <button @click="deletePage()"
             class="w-1000 hover:bg-sky-800 ... px-10 py-4 text-white bg-indigo-500 rounded-md  focus:bg-indigo-600 focus:outline-blue" > Delete Page
           </button>
          </div>
    </div> 
  </div>
  <router-view></router-view>>
</template>