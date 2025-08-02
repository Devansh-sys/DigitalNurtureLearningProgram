import React from "react";

// Sample data: list of office spaces
const officeSpaces = [
  {
    id: 1,
    name: "Sunshine Office",
    rent: 55000,
    address: "123 Main St, City A",
    imageUrl: "https://via.placeholder.com/150?text=Sunshine+Office",
  },
  {
    id: 2,
    name: "Lakeside Workspace",
    rent: 75000,
    address: "456 Lake Rd, City B",
    imageUrl: "https://via.placeholder.com/150?text=Lakeside+Workspace",
  },
  {
    id: 3,
    name: "Downtown Hub",
    rent: 60000,
    address: "789 Center Ave, City C",
    imageUrl: "https://via.placeholder.com/150?text=Downtown+Hub",
  },
];

// Single office object (example)
const office = {
  name: "Mountain View Office",
  rent: 58000,
  address: "321 Hill Rd, City D",
  imageUrl: "https://via.placeholder.com/150?text=Mountain+View+Office",
};

function App() {
  return (
    <div style={{ padding: "20px", fontFamily: "Arial, sans-serif" }}>
      {/* Heading */}
      <h1>Office Space Rental App</h1>

      {/* Single office details */}
      <section style={{ marginBottom: "40px" }}>
        <h2>Featured Office</h2>
        <img
          src={office.imageUrl}
          alt={office.name}
          style={{ width: "150px", height: "150px", objectFit: "cover" }}
        />
        <h3>{office.name}</h3>
        <p>
          Rent:{" "}
          <span style={{ color: office.rent < 60000 ? "red" : "green" }}>
            ₹{office.rent}
          </span>
        </p>
        <p>Address: {office.address}</p>
      </section>

      {/* List of office spaces */}
      <section>
        <h2>Available Office Spaces</h2>
        <ul style={{ listStyleType: "none", paddingLeft: 0 }}>
          {officeSpaces.map(({ id, name, rent, address, imageUrl }) => (
            <li
              key={id}
              style={{
                marginBottom: "30px",
                border: "1px solid #ccc",
                padding: "15px",
                borderRadius: "8px",
                maxWidth: "400px",
              }}
            >
              <img
                src={imageUrl}
                alt={name}
                style={{ width: "150px", height: "150px", objectFit: "cover" }}
              />
              <h3>{name}</h3>
              <p>
                Rent:{" "}
                <span style={{ color: rent < 60000 ? "red" : "green" }}>
                  ₹{rent}
                </span>
              </p>
              <p>Address: {address}</p>
            </li>
          ))}
        </ul>
      </section>
    </div>
  );
}

export default App;
