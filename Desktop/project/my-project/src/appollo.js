
import { ApolloClient, InMemoryCache,createHttpLink } from '@apollo/client/core'
const cache = new InMemoryCache();
const HttpLink = new createHttpLink({
  uri: 'https://cmsgraphqlserver.herokuapp.com/graphql',
})
const apolloClient = new ApolloClient({
    link: HttpLink,
    cache
})

export { apolloClient };