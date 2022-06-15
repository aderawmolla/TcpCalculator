<script>
import { ref } from "vue";
import { useMutation } from "@vue/apollo-composable";
import gql from "graphql-tag";

export default {
  setup() {
    const id=ref('')
    const title = ref('');
    const image_url = ref('');
    const description = ref('');
    const { mutate:updatePage } = useMutation(
      gql`
        mutation updatePage($id:Int,$title: String, $description: String, $image_url: String) {
          updatePage(id:$id,title: $title, description: $description, image_url: $image_url) {
            id
            title
            description
            image_url
          }
        }
      `,
      () => ({
        variables: {
          title: title.value,
          description: description.value,
          image_url: image_url.value,
        },
      })
    );
    return {
      id,
      title,
      description,
      image_url,
      updatePage,
    };
  },
};
</script>
<template>
  <div class="container mx-auto border-solid border-2 border-brown-600 ...">
  <div class="max-w-xl p-5 mx-auto my-10 bg-darkgreen rounded-md shadow-sm"> 
    
    <div>
     <div class="mb-6">
          <label for="title" title=" block mb-2 text-sm text-gray-600"
            >Page ID</label
          >
          <input v-model="id"
            
            placeholder="Enter the id of the page you want to update"
            required
            class="w-full px-3 py-2 placeholder-gray-300 border border-gray-300 rounded-md  focus:outline-none focus:ring focus:ring-indigo-100 focus:border-indigo-300"
          />
        </div>
      <div class="mb-6">
          <label for="title" title=" block mb-2 text-sm text-gray-600"
            >page title</label
          >
          <input v-model="title"
            
            placeholder="Enter the title of page here"
            required
            class="w-full px-3 py-2 placeholder-gray-300 border border-gray-300 rounded-md  focus:outline-none focus:ring focus:ring-indigo-100 focus:border-indigo-300"
          />
        </div>
       
        <div class="mb-6">
          <label for="image" class="block mb-2 text-sm text-gray-600"
            >page_URl</label
          >
          <input v-model="image_url"
            
            placeholder="Enter the url of imsge here"
            required
            class="w-full px-3 py-2 placeholder-gray-300 border border-gray-300 rounded-md  focus:outline-none focus:ring focus:ring-indigo-100 focus:border-indigo-300"
          />
        </div>
        
        </div>
        <div class="mb-6">
          <label for="message" class="block mb-2 text-sm text-gray-600"
            >page description</label
          >

          <textarea v-model="description"
            
            placeholder=" write Your description"
            class="text-slate-500 group-hover:text-white text-sm w-full px-3 py-20 placeholder-gray-300 border border-gray-300 rounded-md  focus:outline-none focus:ring focus:ring-indigo-100 focus:border-indigo-300"
            required
          ></textarea>
        </div>
        <div class="mb-6">
          <button
            @click="updatePage()"
             class=" w-1000 hover:bg-sky-800 ... px-10 py-4 text-white bg-indigo-500 rounded-md  focus:bg-indigo-600 focus:outline-blue" 
          > 
            Edit Page
          </button>
        </div>
    </div>
</div> 
</template>