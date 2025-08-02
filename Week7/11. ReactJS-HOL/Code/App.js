import React, { useState } from "react";

// CurrencyConvertor Component
function CurrencyConvertor() {
  const [rupees, setRupees] = useState("");
  const [euros, setEuros] = useState(null);

  // Conversion rate (example value)
  const conversionRate = 0.012;

  const handleInputChange = (e) => {
    setRupees(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!isNaN(rupees) && rupees.trim() !== "") {
      const converted = (parseFloat(rupees) * conversionRate).toFixed(2);
      setEuros(converted);
    } else {
      setEuros(null);
      alert("Please enter a valid number");
    }
  };

  return (
    <div style={{ marginTop: "30px" }}>
      <h2>Currency Convertor (INR to Euro)</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={rupees}
          onChange={handleInputChange}
          placeholder="Enter amount in Rupees"
          style={{ padding: "8px", marginRight: "10px" }}
        />
        <button type="submit">Convert</button>
      </form>
      {euros !== null && (
        <p>
          {rupees} INR = <strong>{euros} Euro</strong>
        </p>
      )}
    </div>
  );
}

function App() {
  const [counter, setCounter] = useState(0);

  // Increment function
  const increment = () => {
    setCounter((prev) => prev + 1);
  };

  // Say hello function - displays a console message
  const sayHello = () => {
    console.log("Hello! This is a static message.");
    alert("Hello! This is a static message.");
  };

  // Combined handler for the Increment button
  const handleIncrementClick = () => {
    increment();
    sayHello();
  };

  // Function that takes an argument
  const sayWelcome = (message) => {
    alert(message);
  };

  // Synthetic event handler for onClick (React's synthetic event)
  const handleOnPress = (e) => {
    alert("I was clicked");
  };

  return (
    <div style={{ padding: "20px", fontFamily: "Arial, sans-serif" }}>
      <h1>Event Examples App</h1>

      {/* Counter Section */}
      <section style={{ marginBottom: "20px" }}>
        <h2>Counter: {counter}</h2>
        <button onClick={handleIncrementClick} style={{ marginRight: "10px" }}>
          Increment
        </button>
        <button onClick={() => setCounter(counter - 1)}>Decrement</button>
      </section>

      {/* Say Welcome Button */}
      <section style={{ marginBottom: "20px" }}>
        <button onClick={() => sayWelcome("Welcome")}>Say Welcome</button>
      </section>

      {/* Synthetic event button */}
      <section style={{ marginBottom: "20px" }}>
        <button onClick={handleOnPress}>Click me (OnPress)</button>
      </section>

      {/* Currency Convertor Component */}
      <CurrencyConvertor />
    </div>
  );
}

export default App;
