import React, { useState } from "react";

// 1. BookDetails component
function BookDetails() {
  return (
    <div>
      <h2>Book Details</h2>
      <p>Title: React for Beginners</p>
      <p>Author: John Doe</p>
      <p>Publisher: TechPress</p>
    </div>
  );
}

// 2. BlogDetails component
function BlogDetails() {
  return (
    <div>
      <h2>Blog Details</h2>
      <p>Title: Learning React</p>
      <p>Author: Jane Smith</p>
      <p>Date: August 2025</p>
    </div>
  );
}

// 3. CourseDetails component
function CourseDetails() {
  return (
    <div>
      <h2>Course Details</h2>
      <p>Course: Advanced React</p>
      <p>Instructor: Alice Brown</p>
      <p>Duration: 4 weeks</p>
    </div>
  );
}

function App() {
  /*
   * state 'view' manages which component to display
   * Possible values: "book", "blog", "course"
   */
  const [view, setView] = useState("book");

  return (
    <div style={{ padding: "20px", fontFamily: "Arial, sans-serif" }}>
      <h1>Blogger App - Conditional Rendering Demo</h1>

      <div style={{ marginBottom: "20px" }}>
        <button onClick={() => setView("book")} style={{ marginRight: 10 }}>
          Show Book Details
        </button>
        <button onClick={() => setView("blog")} style={{ marginRight: 10 }}>
          Show Blog Details
        </button>
        <button onClick={() => setView("course")}>Show Course Details</button>
      </div>

      {/* 1. Using if-else (ternary operator) */}
      <div style={{ border: "1px solid #ccc", padding: 10, marginBottom: 20 }}>
        <h3>Conditional Rendering Using Ternary (if-else)</h3>
        {view === "book" ? (
          <BookDetails />
        ) : view === "blog" ? (
          <BlogDetails />
        ) : (
          <CourseDetails />
        )}
      </div>

      {/* 2. Using logical && operator */}
      <div style={{ border: "1px solid #ccc", padding: 10, marginBottom: 20 }}>
        <h3>Conditional Rendering Using Logical AND (&&)</h3>
        {view === "book" && <BookDetails />}
        {view === "blog" && <BlogDetails />}
        {view === "course" && <CourseDetails />}
      </div>

      {/* 3. Using switch-case styled rendering (function) */}
      <div style={{ border: "1px solid #ccc", padding: 10 }}>
        <h3>Conditional Rendering Using Switch-Case (Function)</h3>
        {(() => {
          switch (view) {
            case "book":
              return <BookDetails />;
            case "blog":
              return <BlogDetails />;
            case "course":
              return <CourseDetails />;
            default:
              return null;
          }
        })()}
      </div>
    </div>
  );
}

export default App;
