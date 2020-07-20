namespace plag
{
    partial class Plagiarism
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.TWOFILES = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // textBox1
            // 
            this.textBox1.BackColor = System.Drawing.Color.Black;
            this.textBox1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, ((System.Drawing.FontStyle)(((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Underline) 
                | System.Drawing.FontStyle.Strikeout))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBox1.ForeColor = System.Drawing.Color.Azure;
            this.textBox1.Location = new System.Drawing.Point(304, 12);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(399, 31);
            this.textBox1.TabIndex = 0;
            this.textBox1.Text = "WELCOME TO PLAGIARISM LEAKS";
            // 
            // TWOFILES
            // 
            this.TWOFILES.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TWOFILES.Location = new System.Drawing.Point(326, 77);
            this.TWOFILES.Name = "TWOFILES";
            this.TWOFILES.Size = new System.Drawing.Size(353, 73);
            this.TWOFILES.TabIndex = 1;
            this.TWOFILES.Text = "CHECK PLAGIARISM FILES";
            this.TWOFILES.UseVisualStyleBackColor = true;
            this.TWOFILES.Click += new System.EventHandler(this.button1_Click);
            // 
            // Plagiarism
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = global::plag.Properties.Resources.maxresdefault;
            this.ClientSize = new System.Drawing.Size(882, 450);
            this.Controls.Add(this.TWOFILES);
            this.Controls.Add(this.textBox1);
            this.ForeColor = System.Drawing.Color.CornflowerBlue;
            this.Name = "Plagiarism";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Button TWOFILES;
    }
}

