<script>
import { ref } from "vue";
import { useMutation } from "@vue/apollo-composable";
import gql from "graphql-tag";

export default {
  setup() {
    const title = ref("");
    const image_url = ref("");
    const description = ref("");
    const { mutate: createPage } = useMutation(
      gql`
        mutation createPage($title: String, $description: String, $image_url: String) {
          createPage(title: $title, description: $description, image_url: $image_url) {
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
      title,
      description,
      image_url,
      createPage,
    };
  },
};
</script>
<template>
  <div>
    <input v-model="title" placeholder="Enter the title" />
    <input v-model="description" placeholder="Enter the description" />
    <input v-model="image_url" placeholder="enter image url" />
    <button @click="createPage()">Add Page</button>
  </div>
</template>
