import React, { useState } from "react";

// Sample flight details data
const flights = [
  {
    id: 1,
    flightNo: "AI101",
    origin: "Delhi",
    destination: "Mumbai",
    time: "10:00 AM",
  },
  {
    id: 2,
    flightNo: "6E202",
    origin: "Bangalore",
    destination: "Chennai",
    time: "1:30 PM",
  },
  {
    id: 3,
    flightNo: "SG303",
    origin: "Kolkata",
    destination: "Goa",
    time: "6:45 PM",
  },
];

// Guest component: shows flight details and Login button
function Guest({ onLogin }) {
  return (
    <div>
      <h1>Welcome, Guest!</h1>
      <h2>Available Flights:</h2>
      <ul>
        {flights.map(({ id, flightNo, origin, destination, time }) => (
          <li key={id}>
            <strong>{flightNo}</strong>: {origin} ➔ {destination} at {time}
          </li>
        ))}
      </ul>
      <button onClick={onLogin}>Login</button>
    </div>
  );
}

// User component: shows booking form and Logout button
function User({ onLogout }) {
  const [selectedFlight, setSelectedFlight] = useState("");
  const [bookingConfirmed, setBookingConfirmed] = useState(false);

  const handleBooking = (e) => {
    e.preventDefault();
    if (selectedFlight) {
      setBookingConfirmed(true);
    } else {
      alert("Please select a flight to book");
    }
  };

  return (
    <div>
      <h1>Welcome, User!</h1>
      <button onClick={onLogout} style={{ marginBottom: "20px" }}>
        Logout
      </button>

      {!bookingConfirmed ? (
        <form onSubmit={handleBooking}>
          <label htmlFor="flightSelect">Select a flight to book:</label>
          <br />
          <select
            id="flightSelect"
            value={selectedFlight}
            onChange={(e) => setSelectedFlight(e.target.value)}
            style={{ margin: "10px 0", padding: "5px" }}
          >
            <option value="">--Select Flight--</option>
            {flights.map(({ id, flightNo, origin, destination, time }) => (
              <option key={id} value={flightNo}>
                {flightNo}: {origin} ➔ {destination} at {time}
              </option>
            ))}
          </select>
          <br />
          <button type="submit">Book Ticket</button>
        </form>
      ) : (
        <div>
          <h2>Booking Confirmed!</h2>
          <p>
            Your ticket for flight <strong>{selectedFlight}</strong> has been
            booked.
          </p>
          <button onClick={() => setBookingConfirmed(false)}>
            Book Another Ticket
          </button>
        </div>
      )}
    </div>
  );
}

function App() {
  const [loggedIn, setLoggedIn] = useState(false);

  const handleLogin = () => setLoggedIn(true);
  const handleLogout = () => setLoggedIn(false);

  return (
    <div
      style={{
        padding: "20px",
        fontFamily: "Arial, sans-serif",
        maxWidth: "600px",
        margin: "auto",
      }}
    >
      {loggedIn ? (
        <User onLogout={handleLogout} />
      ) : (
        <Guest onLogin={handleLogin} />
      )}
    </div>
  );
}

export default App;
