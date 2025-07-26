import React from "react";
import styles from "./CohortDetails.module.css"; // Import the CSS Module

const CohortDetails = ({ status = "ongoing" }) => {
  // Default status to 'ongoing' for demo
  return (
    <div className={styles.box}>
      {" "}
      {/* Apply the 'box' class to the container div */}
      <h3 className={status === "ongoing" ? styles.ongoing : styles.other}>
        Cohort Status: {status}
      </h3>
      <dl>
        <dt>Cohort Name</dt>
        <dd>Example Cohort</dd>
        <dt>Start Date</dt>
        <dd>July 1, 2025</dd>
        <dt>End Date</dt>
        <dd>December 31, 2025</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;
