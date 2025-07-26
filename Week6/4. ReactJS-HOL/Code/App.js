import React, { Component } from 'react';

class App extends Component {
  componentDidMount() {
    this.loadPosts();
  }

  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => response.json())
      .then((data) => {
        this.setState({ posts: data });
      })
      .catch((error) => console.error("Error fetching posts:", error));
  }

  constructor(props) {
    super(props);
    this.state = {
      posts: [], // Array to hold fetched posts
    };
  }

  render() {
    return (
      <div>
        <h1>React Lifecycle Lab</h1>
        <ul>
          {this.state.posts.map((post) => (
            <li key={post.id}>{post.title}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default App;
