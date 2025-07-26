import React, { Component } from "react";
import CohortDetails from "./components/CohortDetails"; // Import the new component

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [], // From previous lab
    };
  }

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

  componentWillUnmount() {
    console.log("Component is unmounting – cleanup here if needed");
  }

  render() {
    return (
      <div>
        <h1>React Lifecycle Lab with Cohort Details</h1>
        {/* Previous posts list */}
        <ul>
          {this.state.posts.map((post) => (
            <li key={post.id}>{post.title}</li>
          ))}
        </ul>
        {/* New CohortDetails components with different statuses */}
        <CohortDetails status="ongoing" /> {/* Should show green h3 */}
        <CohortDetails status="completed" /> {/* Should show blue h3 */}
      </div>
    );
  }
}

export default App;
